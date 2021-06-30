package com.hmclellan.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hmclellan.productsandcategories.models.Categories_Products;

@Repository
public interface Categories_ProductsRepository extends CrudRepository<Categories_Products, Long> {
	List<Categories_Products> findAll();
}