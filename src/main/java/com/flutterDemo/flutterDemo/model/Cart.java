package com.flutterDemo.flutterDemo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "cart")
    private List<Product> products;
}
