package com.masai.associationmapping.OneToOneBi;

import javax.persistence.*;

//@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pID;
    private String pNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;


    public Passport(int pID, String pNumber, User user) {
        this.pID = pID;
        this.pNumber = pNumber;
        this.user = user;
    }


    public Passport() {
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "pID=" + pID +
                ", pNumber='" + pNumber + '\'' +
                ", user=" + user +
                '}';
    }
}
