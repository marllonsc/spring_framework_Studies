package com.msc.spring.config;

import com.msc.spring.dao.Dao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean()
    @Qualifier("newdDao")
    public Dao newDao(){
        return new Dao();
    }
}
