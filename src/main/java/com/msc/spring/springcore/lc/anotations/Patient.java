package com.msc.spring.springcore.lc.anotations;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside setter Method");
        this.id = id;
    }

    @PostConstruct
    public void hi(){
        System.out.println("Inside hi Method");
    }

    @PreDestroy
    public void bye(){
        System.out.println("Inside bye Method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
