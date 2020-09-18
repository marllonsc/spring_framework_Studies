package com.msc.spring;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@Configuration
public class SpringWebBootTest
{

    @Autowired
    ApplicationContext context;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
