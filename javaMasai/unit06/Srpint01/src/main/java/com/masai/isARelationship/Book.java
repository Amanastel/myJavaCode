package com.masai.isARelationship;

import javax.persistence.Entity;

@Entity
public class Book extends Product{
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
