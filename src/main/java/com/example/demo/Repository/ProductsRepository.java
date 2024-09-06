package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    List<Products> findByTitle(String title);
    // Additional query methods can be defined here
}
