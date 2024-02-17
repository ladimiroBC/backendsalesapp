package com.project.salesapp.service.implement;

import com.project.salesapp.dao.ProductDao;
import com.project.salesapp.models.Product;
import com.project.salesapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductServiceImplement implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Transactional(readOnly = false)
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    @Transactional(readOnly = false)
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Transactional(readOnly = false)
    public void delete(Integer id) {
        productDao.deleteById(id);
    }

    @Transactional(readOnly = false)
    public Product findById(Integer id) {
        return productDao.findById(id).orElse(null);
    }
}
