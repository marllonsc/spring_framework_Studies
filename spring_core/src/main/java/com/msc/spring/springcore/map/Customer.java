package com.msc.spring.springcore.map;

import java.util.Map;

public class Customer {

    private int id;
    private Map<Integer,String> products;

    public Customer(){};

    public Customer(int id, Map<Integer, String> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }


}
