package com.msc.spring.config;

import com.msc.spring.dao.Dao;
import com.msc.spring.service.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Qualifier("newService")
    public Service service(){
        return new Service();
    }
}
