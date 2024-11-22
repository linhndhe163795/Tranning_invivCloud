package com.example.hello_spring_boot.entity.product.entity;

import com.example.hello_spring_boot.entity.product_type.entity.ProductType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "PRODUCT")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_CD")
    private int productCd;
    @Column(name = "DATE_OFFERED")
    private Date dateOffered;
    @Column(name = "DATE_RETIRED")
    private Date dateRetired;
    @Column(name = "PRODUCT_TYPE_CD")
    private int productTypeCd;
    @ManyToOne
    @JoinColumn(name = "PRODUCT_TYPE_CD",insertable = false, updatable = false)
    private ProductType productType;
}
