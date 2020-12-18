package com.applicateai.assignment.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="supplier")
public class Supplier {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="supplier" ,cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Catalog> catalogs = new ArrayList<>();

    public Supplier() {
    }

    public Supplier(String name) {
        this.name = name;
    }

    public Supplier(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }
}
