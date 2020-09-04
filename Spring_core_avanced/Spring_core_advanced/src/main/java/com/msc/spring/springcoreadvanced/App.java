package com.msc.spring.springcoreadvanced;

import com.msc.spring.springcoreadvanced.autowiring.Employee;
import com.msc.spring.springcoreadvanced.placeholder.MyDAO;
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

        ApplicationContext contructInjection = new ClassPathXmlApplicationContext("autowiring.xml");
        Employee emp2 = (Employee) contructInjection.getBean("employee");
        System.out.println(emp2);
        com.msc.spring.springcoreadvanced.autowiring.anotations.Employee emp3 = (com.msc.spring.springcoreadvanced.autowiring.anotations.Employee) contructInjection.getBean("employee2");
        System.out.println(emp3);

        ApplicationContext properties = new ClassPathXmlApplicationContext("configProperties.xml");
        MyDAO dao = (MyDAO) properties.getBean("myDAO");
        System.out.println(dao);


    }
}
