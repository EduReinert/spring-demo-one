package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // carregar o arquivo para configurar o Spring
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //resgatar Bean do Spring Container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theSoccerManager = context.getBean("mySoccerManager", Coach.class);

        // chamar métodos no Bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theSoccerManager.getDailyWorkout());

        // fechar
        context.close();
    }
}
