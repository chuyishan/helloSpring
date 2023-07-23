package com.cys.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class InheritMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansInherit.xml");

        HelloSpring objA = (HelloSpring)context.getBean("helloSpring");
        objA.getMessage1();
        objA.getMessage2();

        HelloWorld objB = (HelloWorld)context.getBean("helloWorld");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();

    }
}
