package com.applicateai.assignment;

import com.applicateai.assignment.entity.Catalog;
import com.applicateai.assignment.entity.Supplier;
import com.applicateai.assignment.payload.RequestNewCatalog;
import com.applicateai.assignment.repository.CatalogRepository;
import com.applicateai.assignment.service.CatalogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicateAiAssignmentApplicationTests {

    @Autowired
    private CatalogService catalogService;

    @Autowired
    private CatalogRepository catalogRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void requestGetMethodSupplierA() {
        List<Object> list = catalogService.listName("ing", "SUPPLIER_A");
        System.out.println(list);
    }

    @Test
    public void requestGetMethodSupplierB() {
        List<Object> list = catalogService.listName("ing", "SUPPLIER_B");
        System.out.println(list);
    }

    @Test
    public void requestPostMethodCreateCatalog() {
        RequestNewCatalog newCatalog = new RequestNewCatalog();
        newCatalog.setName("Pepsi");
        newCatalog.setDescription("Pepsi is a carbonated soft drink");
        newCatalog.setBrandName("PepsiCo");
        newCatalog.setBrandDescription("PepsiCo created and developed in 1893 by Caleb Bradham and introduced as Brad's Drink");
        newCatalog.setSupplier(new Supplier((long) 1, "SUPPLIER_A"));

        catalogRepository.save(new Catalog(newCatalog.getName(),
                newCatalog.getDescription(), newCatalog.getBrandName(),
                newCatalog.getBrandDescription(), newCatalog.getSupplier()));


        List<Catalog> catalogList = catalogRepository.findAll();
        catalogList.stream().map(Catalog::getName).forEach(System.out::println);
    }
}
