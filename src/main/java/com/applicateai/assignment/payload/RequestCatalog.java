package com.applicateai.assignment.payload;

public class RequestCatalog {

    private String keyword;
    private String supplierName;

    public RequestCatalog(String keyword, String supplierName) {
        this.keyword = keyword;
        this.supplierName = supplierName;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
