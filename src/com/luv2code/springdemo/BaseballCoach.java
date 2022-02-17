package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //definir um campo privado para a dependência
    private FortuneService fortuneService;

    //definir um construtor para a injeção de dependência
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spent 30 minutes on running practice";
    }

    @Override
    public String getDailyFortune() {
        //usar meu fortuneService para conseguir um fortune
        return fortuneService.getFortune();
    }
}
