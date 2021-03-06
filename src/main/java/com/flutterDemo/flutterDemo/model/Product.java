package com.flutterDemo.flutterDemo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Setter
@Getter
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;
    private double price;
    private double discount;
    private String shortDescription;
    private String longDescription;
    private int quantity;
    private String thumbnail;

}
