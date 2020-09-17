package com.msc.spring;


import com.msc.spring.bean.ConfigBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan()
public class SpringAop implements CommandLineRunner
{
    @Autowired
    @Qualifier("config")
    ConfigBeans configBeans;

    public static void main( String[] args )
    {
        SpringApplication.run(SpringAop.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Result "+configBeans.getProductService().multiply(2,2));
    }
}
