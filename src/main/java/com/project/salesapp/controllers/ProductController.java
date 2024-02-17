package com.project.salesapp.controllers;

import com.project.salesapp.models.Product;
import com.project.salesapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(value = "/")
    public ResponseEntity<Product> add(@RequestBody Product product) {
        Product object = productService.save(product);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Product> delete(@PathVariable Integer id) {
        Product object = productService.findById(id);

        if(object != null)
            productService.delete(id);
        else
            return new ResponseEntity<>(object, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @PutMapping(value = "/")
    public ResponseEntity<Product> edit(@RequestBody Product product) {
        Product object = productService.findById(product.getIdProduct());

        if (object != null) {
            object.setAmount(product.getAmount());
            object.setProductName(product.getProductName());
            object.setPurchaseValue(product.getPurchaseValue());
            object.setPurchaseSale(product.getPurchaseSale());
            productService.save(object);
        }
        else {
            return new ResponseEntity<>(object, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<Product> read() {
        return productService.findAll();
    }

    @GetMapping("/list/{id}")
    public Product readById(@PathVariable Integer id) {
        return productService.findById(id);
    }
}
