package com.masai.associationmapping.OneToOneBi;

import javax.persistence.*;

//@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String username;

    @OneToOne(mappedBy = "user")
    private Passport passport;

    public User(int userID, String username, Passport passport) {
        this.userID = userID;
        this.username = username;
        this.passport = passport;
    }


    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", passport=" + passport +
                '}';
    }
}
