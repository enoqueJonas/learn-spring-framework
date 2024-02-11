package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main (String[]args){
        //1-> Laucnh a Spring context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //2-> Configure the things we want Spring to manage

            System.out.println(context.getBean("name"));
        }
    }
}
