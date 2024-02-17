package com.project.salesapp.service;

import com.project.salesapp.models.Product;
import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product save(Product product);
    public void delete(Integer id);
    public Product findById(Integer id);
}
