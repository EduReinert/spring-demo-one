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

        // prototype
        Coach jj = context.getBean("jorgeJesus", Coach.class);

        // singleton (referencia o mesmo ID do bean
        Coach jj02 = context.getBean("jorgeJesus02", Coach.class);
        Coach jj03 = context.getBean("jorgeJesus02", Coach.class);

        // checar se são os mesmos beans

        boolean result = (theCoach == alphaCoach);
        boolean result2 = (jj02 == jj03);

        // mostrar os resultados
        System.out.println("Aponta para o mesmo objeto: " + result);
        System.out.println("Locação de memória para theCoach: " + theCoach);
        System.out.println("Locação de memória para alphaCoach: " + alphaCoach);
        System.out.println("O melhor : " + jj);
        System.out.println("O melhor v2 : " + jj02);
        System.out.println("O melhor v3 : " + jj03);

        // fechar o context
        context.close();
    }
}
