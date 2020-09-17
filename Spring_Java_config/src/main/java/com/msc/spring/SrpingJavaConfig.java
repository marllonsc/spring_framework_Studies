package com.msc.spring;

import com.msc.spring.config.ApplicationContextProvider;
import com.msc.spring.dao.Dao;
import com.msc.spring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan()
public class SrpingJavaConfig implements CommandLineRunner
{
    @Autowired
    private ApplicationContextProvider applicationContext;

    @Autowired
    private ConfigurableApplicationContext ob;

    public static void main( String[] args )
    {
        SpringApplication.run(SrpingJavaConfig.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Dao dao = applicationContext.getContext().getBean("newdDao",Dao.class);
        Service service = applicationContext.getContext().getBean("newService",Service.class);
        dao.create();
        service.save();
        ob.close();
    }
}
