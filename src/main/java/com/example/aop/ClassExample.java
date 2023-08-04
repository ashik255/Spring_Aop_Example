package com.example.aop;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class ClassExample {
    public void printHello(){
        System.out.println("Hello world");
    }
    int getNum(){
        Random r=new Random();
        System.out.println("getNum method called");
        return r.nextInt();
    }
    public int getSum(int a, int b){
        System.out.println("getSum method called");
        return a+b;
    }
}
