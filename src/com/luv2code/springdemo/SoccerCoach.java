package com.luv2code.springdemo;

public class SoccerCoach implements Coach{

    //definir um campo privado para a dependência
    private FortuneService fortuneService;

    //definir um construtor para a injeção de dependência
    public SoccerCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spent 2hrs practicing crossing and finishing";
    }

    @Override
    public String getDailyFortune() {
        //usar meu fortuneService para conseguir um fortune
        return fortuneService.getFortune();
    }
}
