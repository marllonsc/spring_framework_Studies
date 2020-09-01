package com.msc.spring.springcore.set;

import java.util.Set;

public class CarDealer {

    private String name;
    private Set<String> models;

    public CarDealer(){}

    public CarDealer(String name, Set<String> models) {
        this.name = name;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public Set<String> getModels() {
        return models;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModels(Set<String> models) {
        this.models = models;
    }
}
