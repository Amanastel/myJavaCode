package com.masai.associationmapping.maniToOneUni;

import javax.persistence.*;


//@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sID;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aID")
    private Address address;

    public Student(int sID, String name, Address address) {
        this.sID = sID;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sID=" + sID +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
