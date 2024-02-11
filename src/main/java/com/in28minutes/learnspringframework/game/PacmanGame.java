package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PacmanGame implements GamingConsole{
    public void up(){
        System.out.println("Up!");
    }

    public  void down(){
        System.out.println("Down!");
    }

    public  void right(){
        System.out.println("Right!");
    }

    public  void left(){
        System.out.println("Left!");
    }
}
