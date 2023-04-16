package com.aman.Problem1.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Collage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collageId;
    private String collageName;

    private String collageAddress;

    @OneToMany(mappedBy = "collage",cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public Collage(int collageId, String collageName, String collageAddress, List<Student> students) {
        this.collageId = collageId;
        this.collageName = collageName;
        this.collageAddress = collageAddress;
        this.students = students;
    }

    public Collage() {
    }

    public int getCollageId() {
        return collageId;
    }

    public void setCollageId(int collageId) {
        this.collageId = collageId;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getCollageAddress() {
        return collageAddress;
    }

    public void setCollageAddress(String collageAddress) {
        this.collageAddress = collageAddress;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "collageId=" + collageId +
                ", collageName='" + collageName + '\'' +
                ", collageAddress='" + collageAddress + '\'' +
                ", students=" + students +
                '}';
    }
}
