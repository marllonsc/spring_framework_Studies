package com.msc.spring.springcoreadvanced;

import com.msc.spring.springcoreadvanced.autowiring.Employee;
import com.msc.spring.springcoreadvanced.injecting.interfaces.OrderBO;
import com.msc.spring.springcoreadvanced.placeholder.MyDAO;
import com.msc.spring.springcoreadvanced.sterotype.annotations.Instructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreAdvanced
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

        /*
        Not Worked good

        ApplicationContext standaloneCollections  = new ClassPathXmlApplicationContext("standaloneCollections.xml");
        ProductsList productsList = (ProductsList) standaloneCollections.getBean("productsList");
        System.out.println(productsList);
        *
         */


        ApplicationContext stereotypeAnotation = new ClassPathXmlApplicationContext("sterotypeAnnotations.xml");
        Instructor instructor = (Instructor) stereotypeAnotation.getBean("inst");
        System.out.println(instructor);
        Instructor instructor2 = (Instructor) stereotypeAnotation.getBean("inst");
        System.out.println(instructor.hashCode());
        System.out.println(instructor2.hashCode());

        System.out.println(instructor);
        System.out.println(instructor2);

        ApplicationContext injectingInterface = new ClassPathXmlApplicationContext("injectingInterfaces.xml");
        OrderBO bo = (OrderBO) injectingInterface.getBean("bo");
        bo.placeOrder();



    }
}
