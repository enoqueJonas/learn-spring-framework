package com.in28minutes.learnspringframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}


@Configuration
@ComponentScan()
public class BeanScopeLauncher {
    public static void main (String[]args){
        try(var context = new AnnotationConfigApplicationContext(BeanScopeLauncher.class)
            ){
            context.getBean(BeanScopeLauncher.class);
        }
    }
}

