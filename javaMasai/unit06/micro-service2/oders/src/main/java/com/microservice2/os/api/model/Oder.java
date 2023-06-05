package com.microservice2.os.api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Oder {
    @Id
    private String  oderId;

}
