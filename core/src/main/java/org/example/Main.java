package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static final Logger log= LoggerFactory.getLogger(Main.class);
    //now we are using annotation so no need of beans.xml
    private static final String CONFIG_LOCATION = "beans.xml";
    public static void main(String[] args) {
        log.info("Guess the number game");

        //create context (container)
        ConfigurableApplicationContext context
                =new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        //get numberGenerator bean from context (container)
        NumberGenerator numberGenerator
                =context.getBean("numberGenerator",NumberGenerator.class);

        //call method next() to get a random number
        int number = numberGenerator.next();

        //log generated number
        log.info("number = {}",number); //{} are just placeholder
        //here curly braces replace with argument specified after comma

        //get game bean from context (container)
        Game game = context.getBean(Game.class);

        //call reset method
        game.reset();


        //close context (container)
        context.close();
    }
}
