package com.msc.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class SpringBoot  implements CommandLineRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBoot.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
