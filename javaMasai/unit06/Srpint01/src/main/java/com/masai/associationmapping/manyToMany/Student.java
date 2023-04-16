package com.masai.associationmapping.manyToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name = "SID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentID;

    @Column(name = "SNAME")
    private String studentName;

    @ManyToMany(mappedBy = "studentSet", cascade = CascadeType.ALL)
    private Set<Course> courseSet = new HashSet<>();

    public Student(int studentID, String studentName, Set<Course> courseSet) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.courseSet = courseSet;
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

}

