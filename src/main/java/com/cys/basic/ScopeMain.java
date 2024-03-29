package com.cys.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class ScopeMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ScopeBeans.xml");
        HelloSpring objA = (HelloSpring)context.getBean("helloSpring");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloSpring objB = (HelloSpring)context.getBean("helloSpring");
        objB.getMessage();
    }
}