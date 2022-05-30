package org.example.console;


import lombok.extern.slf4j.Slf4j;
import org.example.config.GameConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    //here, lombok is used to optimize LOC(line of code) and so, log is internally used.
    //no need to write logger code because of lombok to make lesser LOC.
    //public static final Logger log = LoggerFactory.getLogger(Main.class);
    //now we are using annotation so no need of beans.xml

    public static void main(String[] args) {
        log.info("Guess the number game");

        //create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(GameConfig.class);

        //close context (container)
        context.close();
    }
}
