package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public Student getStudentByRoll(Integer roll) throws StudentException;

    public List<Student> getAllStudent() throws StudentException;
}
