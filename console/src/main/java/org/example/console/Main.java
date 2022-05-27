package org.example.console;


import org.example.config.AppConfig;
import org.example.MessageGenerator;
import org.example.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static final Logger log= LoggerFactory.getLogger(Main.class);
    //now we are using annotation so no need of beans.xml

    public static void main(String[] args) {
        log.info("Guess the number game");

        //create context (container)
        ConfigurableApplicationContext context
                =new AnnotationConfigApplicationContext(AppConfig.class);

        //get numberGenerator bean from context (container)
        NumberGenerator numberGenerator
                =context.getBean(NumberGenerator.class);

        //call method next() to get a random number
        int number = numberGenerator.next();

        //log generated number
        log.info("number = {}",number); //{} are just placeholder
        //here curly braces replace with argument specified after comma

        //get message generator bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info("getMainMessage = {}",messageGenerator.getMainMessage());
        log.info("getResultMessage = {}",messageGenerator.getResultMessage());

        //close context (container)
        context.close();
    }
}
