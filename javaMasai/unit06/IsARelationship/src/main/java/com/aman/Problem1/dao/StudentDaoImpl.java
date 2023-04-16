package com.aman.Problem1.dao;



import com.aman.Problem1.model.Student;
import com.aman.Problem1.util.EMUtils;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public void getAllStudent(int collageId) {
        EntityManager em = EMUtils.getEntityManager();
        Query query1 = em.createQuery("SELECT s FROM Student s WHERE s.collage.collageId = :collageId");
        query1.setParameter("collageId", collageId);
        List<Student> studentsInCollege1 = query1.getResultList();
        for (Student student : studentsInCollege1) {
            System.out.println(student.getStudentName());
        }
        em.close();
    }

    @Override
    public void CollegeDetails(int studentRoll) {
        EntityManager em = EMUtils.getEntityManager();
        Student student = em.find(Student.class, studentRoll);
        System.out.println(student.getCollage());
        em.close();
    }
}
