package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // carregar o spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // resgatar o bean do spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // checar se são os mesmos beans

        boolean result = (theCoach == alphaCoach);

        // mostrar os resultados
        System.out.println("Aponta para o mesmo objeto: " + result);
        System.out.println("Locação de memória para theCoach: " + theCoach);
        System.out.println("Locação de memória para alphaCoach: " + alphaCoach);

        // fechar o context
        context.close();
    }
}
