package com.applicateai.assignment.repository;

import com.applicateai.assignment.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    @Query("select c from Supplier c where c.name like %?1")
    Optional<Supplier> findIdByName(String name);

}
