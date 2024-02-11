package com.in28minutes.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private ClassA a;

    public ClassB(ClassA a){
        System.out.println("Init Logic");
        this.a = a;
    }
}


@Configuration
@ComponentScan
public class LazyInitializationLauncher {
    public static void main (String[]args){
        try(var context = new AnnotationConfigApplicationContext(com.in28minutes.learnspringframework.examples.d1.LazyInitializationLauncher.class)
            ){
            context.getBean(LazyInitializationLauncher.class);
        }
    }
}

