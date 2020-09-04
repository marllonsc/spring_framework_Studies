package com.msc.spring.springcoreadvanced.sterotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inst")
@Scope("prototype")
public class Instructor {

    @Value("20")
    private int id;

    @Value("MSC")
    private String name;

    private List<String> topics;

    @Autowired
    private Profile profile;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
