package com.msc.spring;

import com.msc.spring.entity.Product;
import com.msc.spring.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
public class TestSpringDataJpa {

    @Autowired
    ApplicationContext context;

    @Test
    public void saveProduct() {
        ProductRepository repository = context.getBean(ProductRepository.class);
        repository.save(new Product(4l,"Food","Rice",10d));

        repository.findAll().forEach(p -> {System.out.println(p.getPrice());}); //lambda
    }
}
