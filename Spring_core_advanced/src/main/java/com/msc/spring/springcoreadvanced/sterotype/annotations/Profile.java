package com.msc.spring.springcoreadvanced.sterotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

    @Value("Programmer")
    private String title;
    @Value("IBM")
    private String Company;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return Company;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "title='" + title + '\'' +
                ", Company='" + Company + '\'' +
                '}';
    }
}
