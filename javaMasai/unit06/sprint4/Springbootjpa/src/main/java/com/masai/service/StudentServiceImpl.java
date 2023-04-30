package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDto;
import com.masai.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

//        if(opt.isPresent()){
//            Student existingStudent = opt.get();
//
//            return existingStudent;
//        }
//        throw new StudentException("Student not fount with roll "+roll);

        return opt.orElseThrow(() -> new StudentException("Student not fount with roll "+roll));
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

    @Override
    public Student deleteByStudentRoll(Integer roll) throws StudentException {

         Student existStudent = studentRepository.findById(roll).orElseThrow(() -> new StudentException("Student does not exist with roll " + roll));

         studentRepository.delete(existStudent);

         return existStudent;
    }

    @Override
    public Student updateStudent(Integer roll, StudentDto student) throws StudentException {

        Optional<Student> opt = studentRepository.findById(roll);

        if(opt.isPresent()){
            Student existingStudent = opt.get();
            existingStudent.setName(student.getName());
            existingStudent.setAddress(student.getAddress());
            existingStudent.setMarks(student.getMarks());


            //save() method will work as save Or merge with respect to id filled
            return studentRepository.save(existingStudent);


        }else
            throw new StudentException("Invalid Student Roll Number"+roll);
    }

    @Override
    public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException {

        Student existingStudent = studentRepository.findById(roll).orElseThrow(() -> new StudentException("Invalid Roll Number"));

        existingStudent.setMarks(existingStudent.getMarks()+graceMarks);

        return studentRepository.save(existingStudent);
    }

    @Override
    public List<Student> getStudentByAddress(String address) throws StudentException {

        List<Student> allStudent = studentRepository.findByAddress(address);

        if(allStudent.isEmpty()){
            throw new StudentException("Student not exist by this address "+ address);
        }else {
            return allStudent;
        }
    }
}
