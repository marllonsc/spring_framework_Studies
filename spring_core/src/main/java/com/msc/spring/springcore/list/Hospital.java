package com.msc.spring.springcore.list;

import java.util.List;

public class Hospital {

    private String name;
    private List<String> departaments;

    public Hospital(){}

    public Hospital(String name, List<String> departaments) {
        this.name = name;
        this.departaments = departaments;
    }

    public String getName() {
        return name;
    }

    public List<String> getDepartaments() {
        return departaments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartaments(List<String> departaments) {
        this.departaments = departaments;
    }
}
