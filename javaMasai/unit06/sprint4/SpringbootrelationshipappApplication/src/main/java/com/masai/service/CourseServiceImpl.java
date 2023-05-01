package com.masai.service;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;
    @Override
    public Course registerNewCourse(Course course) {

        Set<Student> studentSet = course.getStudents();

        for(Student student: studentSet){
            //associating each student with course
            student.getCourses().add(course);
        }
        return courseDao.save(course);
    }
}
