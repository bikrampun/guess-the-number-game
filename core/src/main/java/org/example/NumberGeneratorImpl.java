package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator{

    // fields
    private final Random random = new Random();

    @Getter
    private final int maxNumber;
    @Getter
    private final int minNumber;

    //constructor

    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // public methods
    @Override
    public int next() {
        //example: min=5 max=20 -> max-min=15 -> range 0-15 + min -> 5-20
        return random.nextInt(maxNumber);
        /* Returns a random number.
           between 0 (inclusive) and maxNumber (exclusive).
         */
    }
}
