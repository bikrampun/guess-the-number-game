package org.example;

import org.springframework.stereotype.Component;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator{

    // fields
    private final Random random = new Random();
    private  int maxNumber = 100;

    // public methods
    @Override
    public int next() {
        return random.nextInt(maxNumber);
        /* Returns a random number.
           between 0 (inclusive) and maxNumber (exclusive).
         */
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
