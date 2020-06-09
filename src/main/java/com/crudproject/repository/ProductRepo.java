package com.crudproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudproject.entity.product;
//JpaRepository defines standard CRUD methods, plus JPA-specific operations
@Repository
public interface ProductRepo extends JpaRepository<product,Integer> {
// purpose of writing the repository interface is to tell Spring Data JPA about the domain type (Product) and ID type (Integer).
}
