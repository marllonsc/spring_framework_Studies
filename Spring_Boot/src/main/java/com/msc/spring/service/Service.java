package com.msc.spring.service;

import com.msc.spring.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    Dao dao;

    @Autowired
    Service(Dao dao){
        System.out.println("Create Service!");
        this.dao = dao;
    }

    public void save(){
        this.dao.create();
    }

}
