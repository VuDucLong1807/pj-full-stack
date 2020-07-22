package com.example.springboot.restful.repository;

import com.example.springboot.restful.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
