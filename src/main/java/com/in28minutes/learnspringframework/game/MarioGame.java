package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Go Up!");
    }

    public  void down(){
        System.out.println("Go into a hole!");
    }

    public  void right(){
        System.out.println("Go right!");
    }

    public  void left(){
        System.out.println("Go left!");
    }
}
