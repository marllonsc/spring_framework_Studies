package com.msc.spring.springcore;

import com.msc.spring.springcore.placeholder.MyDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext properties = new ClassPathXmlApplicationContext("configProperties.xml");
        MyDAO dao = (MyDAO) properties.getBean("myDAO");
        System.out.println(dao);


    }
}
