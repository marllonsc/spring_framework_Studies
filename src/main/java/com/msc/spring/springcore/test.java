package com.msc.spring.springcore;

import com.msc.spring.springcore.activity.ShoppingCart;
import com.msc.spring.springcore.constructorinjection.ambiguty.Addition;
import com.msc.spring.springcore.dependencycheck.Prescription;
import com.msc.spring.springcore.innerbean.Employee;
import com.msc.spring.springcore.lc.activity.TicketReservation;
import com.msc.spring.springcore.lc.xmlconfig.Patient;
import com.msc.spring.springcore.list.Hospital;
import com.msc.spring.springcore.map.Customer;
import com.msc.spring.springcore.properties.CountriesAndLanguages;
import com.msc.spring.springcore.propertyplaceholder.MyDAO;
import com.msc.spring.springcore.reftypes.Student;
import com.msc.spring.springcore.set.CarDealer;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) throws InterruptedException {
        /*
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println("id:"+emp.getId() + " Name:"+emp.getName());

        System.out.println("___________________________________________________________________________________________");

        ClassPathXmlApplicationContext list = new ClassPathXmlApplicationContext("list.xml");
        Hospital hosp = (Hospital) list.getBean("hospital");
        System.out.println("Name:"+hosp.getName());
        int i = 1;
        for (String dep : hosp.getDepartaments()){
            System.out.println("Name Departament "+i+" :"+dep);
            i++;
        }

        System.out.println("___________________________________________________________________________________________");

        ClassPathXmlApplicationContext set = new ClassPathXmlApplicationContext("setConfig.xml");
        CarDealer car = (CarDealer) set.getBean("carDealer");
        System.out.println("Name:"+car.getName());
        i = 1;
        for (String models : car.getModels()){
            System.out.println("Name Models "+i+" :"+models);
            i++;
        }

        System.out.println("___________________________________________________________________________________________");


        ClassPathXmlApplicationContext map = new ClassPathXmlApplicationContext("mapConfig.xml");
        Customer cus = (Customer) map.getBean("cus");
        System.out.println("ID: "+cus.getId());
        System.out.println(cus.getProducts());

        System.out.println("___________________________________________________________________________________________");

        ClassPathXmlApplicationContext props = new ClassPathXmlApplicationContext("propertiesConfig.xml");
        CountriesAndLanguages cl = (CountriesAndLanguages) props.getBean("countriesAndLangs");
        System.out.println(cl.getCountryAndLangs());

        System.out.println("___________________________________________________________________________________________");

        ClassPathXmlApplicationContext stu = new ClassPathXmlApplicationContext("refTypesConfig.xml");
        Student student = (Student) stu.getBean("student");
        System.out.println(student);

        System.out.println("___________________________________________________________________________________________");

        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("activity.xml");
        ShoppingCart shp = (ShoppingCart) act.getBean("shopping");
        System.out.println(shp);

        System.out.println("___________________________________________________________________________________________");

        AbstractApplicationContext lc = new ClassPathXmlApplicationContext("lcconfig.xml");
        Patient pa = (Patient) lc.getBean("patient");
        System.out.println(pa);
        lc.registerShutdownHook();  //to invoke destroy method


        System.out.println("___________________________________________________________________________________________");

        com.msc.spring.springcore.lc.interfaces.Patient pa2 = (com.msc.spring.springcore.lc.interfaces.Patient) lc.getBean("patientInterface");
        System.out.println(pa2);
        lc.registerShutdownHook();

        System.out.println("___________________________________________________________________________________________");


        com.msc.spring.springcore.lc.anotations.Patient pa3 = (com.msc.spring.springcore.lc.anotations.Patient) lc.getBean("patientAnotation");
        System.out.println(pa3);
        lc.registerShutdownHook();

        System.out.println("___________________________________________________________________________________________");


        TicketReservation ticket = (TicketReservation) lc.getBean("ticket");
        System.out.println(ticket);
        lc.registerShutdownHook();

        System.out.println("___________________________________________________________________________________________");




        ApplicationContext dependencyCheck = new ClassPathXmlApplicationContext("dependencyCheck.xml");
        Prescription prescription = (Prescription) dependencyCheck.getBean("prescription");
        System.out.println(prescription);


        ApplicationContext innerBean = new ClassPathXmlApplicationContext("innerBean.xml");
        Employee employee = (Employee) innerBean.getBean("employee");
        System.out.println(employee);

        Employee employee2 = (Employee) innerBean.getBean("employee");
        System.out.println(employee2.hashCode());

        Employee employee3 = (Employee) innerBean.getBean("employee");
        System.out.println(employee3.hashCode());


        ApplicationContext contructInjection = new ClassPathXmlApplicationContext("constructorInjection.xml");ApplicationContext
        com.msc.spring.springcore.constructorinjection.Employee emp = (com.msc.spring.springcore.constructorinjection.Employee) contructInjection.getBean("employee");
        System.out.println(emp);

        ApplicationContext addition = new ClassPathXmlApplicationContext("ambiguty.xml");
        Addition add = (Addition) addition.getBean("addition");
        add = (Addition) addition.getBean("addition1");
        add = (Addition) addition.getBean("addition2");
        add = (Addition) addition.getBean("addition3");


         */

        ApplicationContext properties = new ClassPathXmlApplicationContext("configProperties.xml");
        MyDAO dao = (MyDAO) properties.getBean("myDAO");
        System.out.println(dao);


    }
}
