package com.example.hello_spring_boot.entity.product_type.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "PRODUCT_TYPE")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_TYPE_CD")
    private int productTypeCd;
    @Column(name = "NAME")
    private String name;
}
