package com.msc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * use test;
 *
 * create table user(id int,name varchar(20),email varchar(30));
 *
 * select * from user;
 *
 */
@SpringBootApplication(exclude= HibernateJpaAutoConfiguration.class)
@ComponentScan
public class SpringMvcOrm extends SpringBootServletInitializer
{

    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringMvcOrm.class);
    }

        public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringMvcOrm.class, args);
    }

}
