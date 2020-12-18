package com.applicateai.assignment.payload;

import com.applicateai.assignment.entity.Supplier;

import javax.validation.constraints.NotNull;

public class RequestNewCatalog {
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String brandName;
    @NotNull
    private String brandDescription;
    @NotNull
    private Supplier supplier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
