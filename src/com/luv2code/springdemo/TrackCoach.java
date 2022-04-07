package com.luv2code.springdemo;

import javax.sound.midi.Track;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Ran 5km one-legged";
    }

    @Override
    public String getDailyFortune() {
        //usar meu fortuneService para conseguir um fortune
        return fortuneService.getFortune();
    }

    // adiciona um método init
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: dentro do método doMyStartupStuff");
    }

    // adiciona um método destroy
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: dentro do método doMyCleanupStuff");
    }
}
