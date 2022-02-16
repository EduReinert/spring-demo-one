package com.luv2code.springdemo;

public class MyApp {

    public static void main(String[] args) {

        //criar o objeto
        Coach theCoach = new TrackCoach();
        Coach theSoccerManager = new SoccerCoach();

        //usar o objeto
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theSoccerManager.getDailyWorkout());
    }

}
