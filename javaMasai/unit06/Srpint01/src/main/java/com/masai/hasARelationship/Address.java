package com.masai.hasARelationship;

import java.util.Objects;

public class Address {
    private String city;
    private String state;
    private String pinCode;
    private String rangeOfYears;

    public Address(String city, String state, String pinCode, String rangeOfYears) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.rangeOfYears = rangeOfYears;
    }

    public Address() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(getState(), address.getState()) && Objects.equals(getPinCode(), address.getPinCode()) && Objects.equals(getRangeOfYears(), address.getRangeOfYears());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getState(), getPinCode(), getRangeOfYears());
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", rangeOfYears='" + rangeOfYears + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRangeOfYears() {
        return rangeOfYears;
    }

    public void setRangeOfYears(String rangeOfYears) {
        this.rangeOfYears = rangeOfYears;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


}
