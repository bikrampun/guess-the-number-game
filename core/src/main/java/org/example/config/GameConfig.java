package org.example.config;

import org.example.GuessCount;
import org.example.MaxNumber;
import org.example.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {
    //fields
    //here :50 is default value if this value is not found in game.properties
    @Value("${game.maxNumber:50}")
    private int maxNumber;
    @Value("${game.guessCount:5}")
    private int guessCount;
    @Value("${game.minNumber:5}")
    private int minNumber;

    //bean methods
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }
    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }
}