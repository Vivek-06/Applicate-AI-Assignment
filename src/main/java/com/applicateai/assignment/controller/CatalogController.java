package com.applicateai.assignment.controller;

import com.applicateai.assignment.entity.Catalog;
import com.applicateai.assignment.entity.Supplier;
import com.applicateai.assignment.payload.RequestNewCatalog;
import com.applicateai.assignment.payload.RequestNewSupplier;
import com.applicateai.assignment.repository.CatalogRepository;
import com.applicateai.assignment.repository.SupplierRepository;
import com.applicateai.assignment.service.CatalogService;
import com.applicateai.assignment.payload.RequestCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.List;


@RestController
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    private final CatalogRepository catalogRepository;
    private final SupplierRepository supplierRepository;

    public CatalogController(CatalogRepository catalogRepository, SupplierRepository supplierRepository) {
        this.catalogRepository = catalogRepository;
        this.supplierRepository = supplierRepository;
    }

    @RequestMapping("/api/catalog/get")
    public List<Object> catalogList(@RequestBody RequestCatalog requestCatalog){
        return catalogService.listName(requestCatalog.getKeyword(), requestCatalog.getSupplierName());
    }

    @PostMapping("/api/supplier/post")
    public String createSupplier(@Valid @RequestBody RequestNewSupplier requestNewSupplier){
        supplierRepository.save(new Supplier(requestNewSupplier.getName()));
        return "Supplier Add Successfully";
    }

    @PostMapping("/api/catalog/post")
    public String createCatalog(@Valid @RequestBody RequestNewCatalog requestCatalog){
        catalogRepository.save(new Catalog(requestCatalog.getName(),
                requestCatalog.getDescription(), requestCatalog.getBrandName(),
                requestCatalog.getBrandDescription(), requestCatalog.getSupplier()));

        return "Catalog add Successfully";
    }

}
