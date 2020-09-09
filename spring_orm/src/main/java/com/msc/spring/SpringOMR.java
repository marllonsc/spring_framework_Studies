package com.msc.spring;

/*

Database SQL

        use test;

        create table product(id int,name varchar(20),description varchar(100),price decimal(8,3));

        select * from product;

*/

import com.msc.spring.dao.ProductDao;
import com.msc.spring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOMR implements CommandLineRunner
{

    @Autowired
    @Qualifier("productDao")
    private ProductDao productDao;


    public static void main( String[] args ) {
        SpringApplication.run(SpringOMR.class);
    }

    @Override
    public void run(String... args) throws Exception {
        //productDao.create(new Product(null,"XXXXXXXX","XXXXXXX",10.0));
        //productDao.update(new Product(1,"KKKKKKK","KKKKKKK",7.5));
        //productDao.delete(new Product(4,"XXXXXXXX","XXXXXXX",10.0));
        //productDao.delete(new Product(1,"KKKKKKK","KKKKKKK",7.5));
        Product prod = productDao.read(new Product(2));
        System.out.println(prod);
        System.out.println(productDao.getAll());
    }
}
