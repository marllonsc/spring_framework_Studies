package com.msc.spring.service;

import com.msc.spring.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service("newService")
public class Service {

    @Autowired
    @Qualifier("newDao")
    private Dao dao;

    public void init(){
        System.out.println("Begining");
    }

    public void destroy(){
        System.out.println("End!");
    }

    public void save(){
        dao.create();
    }
}
