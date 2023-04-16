package com.masai.associationmapping.manyToMany;

import com.masai.associationmapping.oneToManyUni.Phone;
import com.masai.associationmapping.oneToManyUni.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr3");
        EntityManager em = entityManagerFactory.createEntityManager();

        /*Course course = new Course();
        course.setCname("JAVA");

        Course course2 = new Course();
        course2.setCname("PYTHON");

        Course course3 = new Course();
        course3.setCname("C++");

        Set<Course> courseSet = new HashSet<>();
        courseSet.add(course);
        courseSet.add(course2);
        courseSet.add(course3);


        Student student = new Student();
        student.setStudentName("Aman Kumar Singh");

        Student student2 = new Student();
        student2.setStudentName("rahul");

        Student student3 = new Student();
        student3.setStudentName("priti tiwari");

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student2);
        studentSet.add(student3);

        course.setStudentSet(studentSet);
        course2.setStudentSet(studentSet);
        course3.setStudentSet(studentSet);

        student.setCourseSet(courseSet);
        student2.setCourseSet(courseSet);
        student3.setCourseSet(courseSet);

        em.getTransaction().begin();
        em.persist(student);
        em.persist(student2);
        em.persist(student3);
        em.getTransaction().commit();*/


        Student s = em.find(Student.class,1);
        System.out.println(s);
        em.close();

    }
}
