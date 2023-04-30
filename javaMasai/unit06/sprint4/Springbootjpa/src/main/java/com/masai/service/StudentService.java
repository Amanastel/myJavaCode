package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDto;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public Student getStudentByRoll(Integer roll) throws StudentException;

    public List<Student> getAllStudent() throws StudentException;

    public Student deleteByStudentRoll(Integer roll) throws StudentException;

    public Student updateStudent(Integer roll, StudentDto student) throws StudentException;

    public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException;

    public List<Student> getStudentByAddress(String address) throws StudentException;

}
