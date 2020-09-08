package com.msc.spring.springcore.constructorinjection.ambiguty;

public class Addition {

    public Addition(int a, int b){
        System.out.println("inside contruction int");
    }

    public Addition(double a, double b){
        System.out.println("inside contruction double");
    }

    public Addition(String a, String b){
        System.out.println("inside contruction String");
    }

    public Addition(int a, String b){
        System.out.println("inside contruction new");
    }
}
