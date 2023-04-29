package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {

        System.out.println(studentRepository.getClass().getName());

        Student savedStudent = studentRepository.save(student);

        return savedStudent;
    }

    @Override
    public Student getStudentByRoll(Integer roll) throws StudentException {


        Optional<Student> opt = studentRepository.findById(roll);

        if(opt.isPresent()){
            Student existingStudent = opt.get();

            return existingStudent;
        }
        throw new StudentException("Student not fount with roll "+roll);

    }

    @Override
    public List<Student> getAllStudent() throws StudentException {
        List<Student> allStudent = studentRepository.findAll();
        if(allStudent.isEmpty()){
            throw new StudentException("No Student found");
        }else {
            return allStudent;
        }
    }
}
