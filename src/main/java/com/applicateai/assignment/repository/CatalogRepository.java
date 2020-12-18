package com.applicateai.assignment.repository;

import com.applicateai.assignment.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CatalogRepository extends JpaRepository<Catalog, Long> {
    @Query("SELECT c from Catalog c  where c.Name LIKE %?1%")
    public List<Catalog> getNameFromSearchField(String keyword);
}
