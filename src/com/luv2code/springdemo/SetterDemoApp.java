package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        // carregar o arquivo de config Spring
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // trazer o bean do container spring
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        // chamar métodos do bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // chamar os novos métodos para pegar os valores literais
        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());

        // fechamento
        context.close();
    }
}
