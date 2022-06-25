package com.flutterDemo.flutterDemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Setter
@Getter
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private double total;
    private int quantity;
    private int vat;

}
