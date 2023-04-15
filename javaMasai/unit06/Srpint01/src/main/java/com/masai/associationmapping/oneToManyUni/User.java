package com.masai.associationmapping.oneToManyUni;

import javax.persistence.*;
import java.util.List;

//@Entity
public class User {
    @Id
    private int userID;
    private String userName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userID")
    private List<Phone>phoneList;

    public User(int userID, String userName, List<Phone> phoneList) {
        this.userID = userID;
        this.userName = userName;
        this.phoneList = phoneList;
    }

    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
}
