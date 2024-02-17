package com.project.salesapp.dao;

import com.project.salesapp.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> { }
