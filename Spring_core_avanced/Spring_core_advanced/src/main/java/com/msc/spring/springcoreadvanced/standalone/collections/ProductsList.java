package com.msc.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductsList {

    private List<String> productNames;

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }

    public List<String> getProductNames() {
        return productNames;
    }

    @Override
    public String toString() {
        return "ProductsList{" +
                "productNames=" + productNames +
                '}';
    }
}
