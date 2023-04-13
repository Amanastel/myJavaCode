package com.masai.hasARelationship;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String name;
    private int marks;

    @Embedded
    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "address", joinColumns = @JoinColumn(name = "student_id"))   // costomise krne ke liye
    private Set<Address> addressSet = new HashSet<>();

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "city", column = @Column(name = "Home_city")),
//            @AttributeOverride(name = "state", column = @Column(name = "Home_state")),
//            @AttributeOverride(name = "pinCode", column = @Column(name = "Home_pinCode"))
//    })
//    private Address homeAddress;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "city", column = @Column(name = "office_city")),
//            @AttributeOverride(name = "state", column = @Column(name = "office_state")),
//            @AttributeOverride(name = "pinCode", column = @Column(name = "office_pinCode"))
//    })
//    private Address officeAddress;

//    public Students(int sid, String name, int marks, Set<Address> addressSet, Address homeAddress, Address officeAddress) {
//        this.sid = sid;
//        this.name = name;
//        this.marks = marks;
//        this.addressSet = addressSet;
//        this.homeAddress = homeAddress;
//        this.officeAddress = officeAddress;
//    }


    public Students(int sid, String name, int marks, Set<Address> addressSet) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
        this.addressSet = addressSet;
    }

    public Students() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }

//    public Address getHomeAddress() {
//        return homeAddress;
//    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//
//    public Address getOfficeAddress() {
//        return officeAddress;
//    }
//
//    public void setOfficeAddress(Address officeAddress) {
//        this.officeAddress = officeAddress;
//    }


    @Override
    public String toString() {
        return "Students{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", addressSet=" + addressSet +
                '}';
    }
}
