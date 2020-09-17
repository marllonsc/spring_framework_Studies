package com.msc.spring.aop;

public class ProductServiceImp implements ProductService{

    @Override
    public int multiply(int n1, int n2) {
        return n1*n2;
    }

}
