package com.masai.service;

import com.masai.exception.CourseException;
import com.masai.model.Student;

import java.util.List;

public interface StudentService {

    public Student registerStudentInCourse(String courseName , Student student) throws CourseException;

    public List<Student> findStudentByCourseName(String cname) throws CourseException;
}
