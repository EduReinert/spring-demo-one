package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // carregar o arquivo para configurar o Spring
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //resgatar Bean do Spring Container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // chamar métodos no Bean
        System.out.println(theCoach.getDailyWorkout());

        //chamar novo método vindo de "fortunes"
        System.out.println(theCoach.getDailyFortune());

        // fechar
        context.close();
    }
}
