package com.msc.spring.springcore;

import com.msc.spring.springcore.Employee;
import com.msc.spring.springcore.activity.ShoppingCart;
import com.msc.spring.springcore.list.Hospital;
import com.msc.spring.springcore.map.Customer;
import com.msc.spring.springcore.properties.CountriesAndLanguages;
import com.msc.spring.springcore.reftypes.Student;
import com.msc.spring.springcore.set.CarDealer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
       // System.out.println("id:"+emp.getId() + " Name:"+emp.getName());

        ClassPathXmlApplicationContext list = new ClassPathXmlApplicationContext("list.xml");
        Hospital hosp = (Hospital) list.getBean("hospital");
        System.out.println("Name:"+hosp.getName());
        int i = 1;
        for (String dep : hosp.getDepartaments()){
            System.out.println("Name Departament "+i+" :"+dep);
            i++;
        }

        ClassPathXmlApplicationContext set = new ClassPathXmlApplicationContext("setConfig.xml");
        CarDealer car = (CarDealer) set.getBean("carDealer");
        System.out.println("Name:"+car.getName());
        i = 1;
        for (String models : car.getModels()){
            System.out.println("Name Models "+i+" :"+models);
            i++;
        }


        ClassPathXmlApplicationContext map = new ClassPathXmlApplicationContext("mapConfig.xml");
        Customer cus = (Customer) map.getBean("cus");
        System.out.println("ID: "+cus.getId());
        System.out.println(cus.getProducts());

        ClassPathXmlApplicationContext props = new ClassPathXmlApplicationContext("propertiesConfig.xml");
        CountriesAndLanguages cl = (CountriesAndLanguages) props.getBean("countriesAndLangs");
        System.out.println(cl.getCountryAndLangs());

        ClassPathXmlApplicationContext stu = new ClassPathXmlApplicationContext("refTypesConfig.xml");
        Student student = (Student) stu.getBean("student");
        System.out.println(student);

        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("activity.xml");
        ShoppingCart shp = (ShoppingCart) act.getBean("shopping");
        System.out.println(shp);
    }
}
