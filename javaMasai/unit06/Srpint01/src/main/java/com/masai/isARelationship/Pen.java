package com.masai.isARelationship;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("2") code(001)
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
