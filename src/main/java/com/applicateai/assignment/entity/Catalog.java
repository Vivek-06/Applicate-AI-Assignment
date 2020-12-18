package com.applicateai.assignment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "catalog")
public class Catalog {

    @Id
    @GeneratedValue
    @Column(name="SKU_code")
    private Long SKUCode;

    @Column(name="SKU_name")
    private String Name;

    @Column(name="SKU_description")
    private String Description;

    @Column(name="Brand_name")
    private String Brand_name;

    @Column(name="Brand_description")
    private String Brand_description;

    @ManyToOne(fetch = FetchType.LAZY, optional=false,cascade = CascadeType.MERGE)
    @JoinColumn(name="Supplier_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Supplier supplier;

    public Catalog() {
    }

    public Catalog(String name, String description, String brand_name, String brand_description, Supplier supplier) {
        Name = name;
        Description = description;
        Brand_name = brand_name;
        Brand_description = brand_description;
        this.supplier = supplier;
    }

    public Long getSKUCode() {
        return SKUCode;
    }

    public void setSKUCode(Long SKUCode) {
        this.SKUCode = SKUCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBrand_name() {
        return Brand_name;
    }

    public void setBrand_name(String brand_name) {
        Brand_name = brand_name;
    }

    public String getBrand_description() {
        return Brand_description;
    }

    public void setBrand_description(String brand_description) {
        Brand_description = brand_description;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
