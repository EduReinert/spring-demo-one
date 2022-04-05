package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    // criar um construtor no-arg
    public CricketCoach() {
        System.out.println("CricketCoach: dentro de um construtor no-arg");
    }

    // método setter
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("método setFortuneService - CricketCoach: dentro de um construtor no-arg");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Praticar cricket por 15min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
