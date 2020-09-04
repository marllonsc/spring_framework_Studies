package com.msc.spring.springcoreadvanced.sterotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inst")
@Scope("prototype")
public class Instructor {

    @Value("#{66+44}")
    private int id;

    @Value("#{T(java.lang.Math).abs(-99)}")
    private int abs;

    @Value("#{'Marllon costa'.toUpperCase()}")
    private String name;

    @Value("#{2+4>5}")
    private boolean active;

    private List<String> topics;

    @Autowired
    private Profile profile;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getAbs() {
        return abs;
    }

    public void setAbs(int abs) {
        this.abs = abs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", abs=" + abs +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }
}
