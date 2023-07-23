package com.cys.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class LifeMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeBeans.xml");
        LifeApp obj = (LifeApp)context.getBean("helloSpring");
        obj.getMessage();
        context.registerShutdownHook();
    }
}