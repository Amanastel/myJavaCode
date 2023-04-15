package com.masai.associationmapping.oneToManyUni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PhoneID;
    private String PhoneNumber;
    private int userID;

    public Phone(int phoneID, String phoneNumber, int userID) {
        PhoneID = phoneID;
        PhoneNumber = phoneNumber;
        this.userID = userID;
    }

    public Phone() {
    }

    public int getPhoneID() {
        return PhoneID;
    }

    public void setPhoneID(int phoneID) {
        PhoneID = phoneID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


}
