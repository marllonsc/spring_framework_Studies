package com.msc.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringWebBoot implements CommandLineRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringWebBoot.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
