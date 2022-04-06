package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    // criar novos campos para emailAddress e team
    private String emailAddress;
    private String team;

    // criar um construtor no-arg
    public CricketCoach() {
        System.out.println("CricketCoach: dentro de um construtor no-arg");
    }

    //getters e setters
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: dentro de método setter - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: dentro de método setter - setTeam");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: dentro de método setter - setFortuneService");
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
