package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spent 30 minutes on running practice";
    }
}
