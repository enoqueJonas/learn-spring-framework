package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Adress(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Enoque";

    }

    @Bean
    public  int age(){
        return 23;
    }

    @Bean(name = "person2")
    public Person person(){
        return new Person("Jonas", 22);
    }

    @Bean
    public Adress adress(){
        return new Adress("1114", "Machava");
    }
}
