package com.msc.spring.dao;

import org.springframework.stereotype.Component;

@Component("newdDao")
public class Dao {

    public void create() {
        System.out.println("Created!");
    }
}
