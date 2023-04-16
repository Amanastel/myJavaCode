package com.masai.associationmapping.manyToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    @Column(name = "CID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CID;

    @Column(name = "CNAME")
    private String cname;

    @ManyToMany
    @JoinTable(
            name = "STUDENT_COURSE",
            joinColumns = {@JoinColumn(name = "CID")},
            inverseJoinColumns = {@JoinColumn(name = "SID")}
    )
    private Set<Student> studentSet = new HashSet<>();


    public Course(int CID, String cname, Set<Student> studentSet) {
        this.CID = CID;
        this.cname = cname;
        this.studentSet = studentSet;
    }

    public Course() {
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
