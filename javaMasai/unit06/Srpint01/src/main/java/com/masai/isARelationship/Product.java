package com.masai.isARelationship;

import javax.persistence.*;


@MappedSuperclass // ye Product ke alawa sare table bana deta hai
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) isse table alag alag to banti h lekin product table empty ban jati hai
//@Inheritance(strategy = InheritanceType.JOINED) // create alag alag tables
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) code(001)
//@DiscriminatorColumn(name = "product_type",discriminatorType = DiscriminatorType.INTEGER) // same table me add kre ga code(001)
public class Product {
    @Id
    private Long ProductID;
    private String name;

    public Product(Long productID, String name) {
        ProductID = productID;
        this.name = name;
    }

    public Product() {
    }

    public Long getProductID() {
        return ProductID;
    }

    public void setProductID(Long productID) {
        ProductID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}