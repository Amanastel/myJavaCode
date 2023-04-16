package com.aman.Problem1.ui;

import com.aman.Problem1.dao.StudentDao;
import com.aman.Problem1.dao.StudentDaoImpl;
import com.aman.Problem1.util.EMUtils;


import javax.persistence.EntityManager;

public class ClientApplication {
    public static void main(String[] args) {
        EntityManager em = EMUtils.getEntityManager();

      /*  Collage collage = new Collage();
        collage.setCollageName("IIT Kanpur");
        collage.setCollageAddress("Kanpur");

        Collage collage2 = new Collage();
        collage2.setCollageName("IIT patna");
        collage2.setCollageAddress("patna");

        Student student1 = new Student();
        student1.setStudentName("Aman Singh");
        student1.setEmail("amankumar.ak0012@gmail.com");
        student1.setMobileNumber("7007219431");
        student1.setCollage(collage);

        Student student2 = new Student();
        student2.setStudentName("Anurag Singh");
        student2.setEmail("Anurag.ak0012@gmail.com");
        student2.setMobileNumber("9080706050");
        student2.setCollage(collage);


        Student student3 = new Student();
        student3.setStudentName("Bhuvi Singh");
        student3.setEmail("Bhuvi.ak0012@gmail.com");
        student3.setMobileNumber("9876543213");
        student3.setCollage(collage);

        Student student4 = new Student();
        student4.setStudentName("rahul Singh");
        student4.setEmail("Rahul.ak0012@gmail.com");
        student4.setMobileNumber("9856743213");
        student4.setCollage(collage);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);


        Student student5 = new Student();
        student5.setStudentName("Manish Singh");
        student5.setEmail("Manish.ak0012@gmail.com");
        student5.setMobileNumber("7234219431");
        student5.setCollage(collage2);

        Student student6 = new Student();
        student6.setStudentName("priti tiwari");
        student6.setEmail("priti.ak0012@gmail.com");
        student6.setMobileNumber("9080907050");
        student6.setCollage(collage2);


        Student student7 = new Student();
        student7.setStudentName("rubel Singh");
        student7.setEmail("rubel.ak0012@gmail.com");
        student7.setMobileNumber("7806543213");
        student7.setCollage(collage2);

        Student student8 = new Student();
        student8.setStudentName("kunal Singh");
        student8.setEmail("kunal.ak0012@gmail.com");
        student8.setMobileNumber("8956743213");
        student8.setCollage(collage2);

        List<Student> studentList2 = new ArrayList<>();
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);

        collage.setStudents(studentList);
        collage2.setStudents(studentList2);

        em.getTransaction().begin();
        em.persist(collage);
        em.persist(collage2);
        em.getTransaction().commit();
        em.close();

       */


        StudentDao studentDao = new StudentDaoImpl();
//        studentDao.getAllStudent(1);
        studentDao.CollegeDetails(1);
    }
}
