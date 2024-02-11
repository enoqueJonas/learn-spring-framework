package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncher {
    public static void main (String[]args){
        var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class);
        context.getBean(GamingConsole.class).up();
    }
}
