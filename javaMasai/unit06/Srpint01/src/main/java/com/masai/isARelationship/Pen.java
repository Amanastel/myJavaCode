package com.masai.isARelationship;

import javax.persistence.Entity;

@Entity
public class Pen extends Product{

    private String color;

    public Pen(String color) {
        this.color = color;
    }

    public Pen() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
