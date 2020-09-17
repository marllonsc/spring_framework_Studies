package com.msc.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

    @Before("execution(* com.msc.spring.aop.ProductServiceImp.multiply(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Before Calling the Method");
    }

    @After("execution(* com.msc.spring.aop.ProductServiceImp.multiply(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("After Calling the Method");
    }

}
