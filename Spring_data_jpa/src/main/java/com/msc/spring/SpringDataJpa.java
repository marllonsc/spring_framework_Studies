package com.msc.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringDataJpa implements CommandLineRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringDataJpa.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
