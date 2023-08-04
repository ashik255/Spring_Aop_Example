package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class AspectConfigAop {

    @Before("execution(* com.example.aop.ClassExample.printHello (..))")
    public void logBeforePrintHello() {
        System.out.println("Before calling method: printHello()");
    }
    @Before("execution(* com.example.aop.ClassExample.getNum (..))")
    public void logBeforeGetNum() {
        System.out.println("Before calling method: GetNum()");
    }
    @Before("execution(* com.example.aop.ClassExample.getSum (..))")
    public void logBeforeGetSum() {
        System.out.println("Before calling method: getSum()");
    }
}
