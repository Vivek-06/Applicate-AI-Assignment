package com.applicateai.assignment.service;

import com.applicateai.assignment.entity.Catalog;
import com.applicateai.assignment.entity.Supplier;
import com.applicateai.assignment.repository.CatalogRepository;
import com.applicateai.assignment.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CatalogService{

    @Autowired
    private CatalogRepository catalogRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Object> listName(String keyword, String supplierName) {
        Optional<Supplier> n = supplierRepository.findIdByName(supplierName);
        List<Catalog> list = catalogRepository.getNameFromSearchField(keyword);
        List<Object> list2 = new ArrayList<>();
        n.ifPresent(user -> {
            list2.add(list.stream()
                    .filter(item -> item.getSupplier().getId() == user.getId())
                    .map(items -> items.getName())
                    .collect(Collectors.toList()));


        });
        return list2;
    }

}
