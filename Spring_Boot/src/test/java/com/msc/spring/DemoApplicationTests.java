package com.msc.spring;

//import org.junit.jupiter.api.Test;
import com.msc.spring.service.Service;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    ApplicationContext context;

    @Test
    public void testService() {
        Service service = context.getBean(Service.class);
        service.save();
    }
}
