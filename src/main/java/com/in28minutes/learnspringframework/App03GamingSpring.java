package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {
    public static void main (String[]args){
//        var marioGame = new MarioGame();
//        var game = new PacmanGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
        var context = new AnnotationConfigApplicationContext(GamingConfig.class);
        context.getBean(GamingConsole.class).up();
    }
}