package com.msc.spring.controller;

import com.msc.spring.entity.Product;
import com.msc.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repo;

    @GetMapping
    public Iterable<Product> getProducts(){
        return repo.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return repo.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return repo.save(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable Long id){
        return repo.findById(id);
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        Optional<Product> product = repo.findById(id);
        repo.delete(product.get());
        return "OK";
    }

}
