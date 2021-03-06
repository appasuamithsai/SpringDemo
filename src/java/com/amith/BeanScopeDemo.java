package com.amith;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach coach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);
        boolean result=(coach==alphaCoach);
        System.out.println("Pointing Same Obj : "+result);
        System.out.println("Memory Location : "+coach);
        System.out.println("Memory Location : "+alphaCoach);
        context.close();

    }
}
