package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune(){
        int[] myFortune = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Random generator = new Random();
        int randomIndex = generator.nextInt(myFortune.length);
        return "Today is(not) your lucky day! Your value is: " + myFortune[randomIndex];
    }
}
