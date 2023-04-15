package com.masai.associationmapping.maniToOneUni;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Address {

    @Id
    private int aID;
    private String city;
    private String pinCode;

    public Address(int aID, String city, String pinCode) {
        this.aID = aID;
        this.city = city;
        this.pinCode = pinCode;
    }

    public Address() {
    }

    public int getaID() {
        return aID;
    }

    public void setaID(int aID) {
        this.aID = aID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aID=" + aID +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
