package com.msc.spring.bean;

import com.msc.spring.aop.ProductService;
import com.msc.spring.aop.ProductServiceImp;
import com.msc.spring.aspects.LogginAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("config")
public class ConfigBeans {

    @Autowired
    @Qualifier("productService")
    ProductService productService;

    @Bean("productService")
    public ProductService productServiceImp(){
        return new ProductServiceImp();
    }

    @Bean()
    public LogginAspect logginAspect(){
        return new LogginAspect();
    }

    public ProductService getProductService() {
        return productService;
    }
}
