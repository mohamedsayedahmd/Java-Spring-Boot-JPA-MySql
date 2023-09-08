package com.javatechie.springbootcrudexample.repository;

import com.javatechie.springbootcrudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
