package com.flutterDemo.flutterDemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
@Setter
@Getter
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

}
