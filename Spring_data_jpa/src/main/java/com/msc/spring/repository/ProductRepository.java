package com.msc.spring.repository;


import com.msc.spring.entity.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository extends CrudRepository<Product,Long> {

    List<Product> findByName(String name);

    List<Product> findByPrice(Double price);

    List<Product> findByNameAndPrice(String name, Double price);

}
