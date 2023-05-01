package com.masai.service;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseDao;
import com.masai.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao sDao;

    @Autowired
    private CourseDao cDao;
    @Override
    public Student registerStudentInCourse(String cName, Student student) throws CourseException{

        Course course = cDao.findByCourseName(cName);
        if(course!=null){
            course.getStudents().add(student);
            student.getCourses().add(course);

            return sDao.save(student);

        }else
            throw new CourseException("Course not found with name "+cName);


    }

    @Override
    public List<Student> findStudentByCourseName(String cname) throws CourseException {

        Set<Student> students = cDao.getStudentByCourseName(cname);
        if (students.size() > 0){
            List<Student> list = new ArrayList<>(students);
            return list;
        }
        else
            throw new CourseException("Course dose not exist with name: "+cname);

    }


}
