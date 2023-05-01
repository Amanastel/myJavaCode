package com.masai.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;
    private String courseName;
    private Integer fre;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

//    public Course(Integer courseId, String courseName, Integer fre, Set<Student> students) {
//        this.courseId = courseId;
//        this.courseName = courseName;
//        this.fre = fre;
//        this.students = students;
//    }
//
//    public Course() {
//    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getFre() {
        return fre;
    }

    public void setFre(Integer fre) {
        this.fre = fre;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return Objects.equals(getCourseId(), course.getCourseId()) && Objects.equals(getCourseName(), course.getCourseName()) && Objects.equals(getFre(), course.getFre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId(), getCourseName(), getFre());
    }
}
