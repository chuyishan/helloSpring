package com.cys.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloSpring obj = (HelloSpring)context.getBean("helloSpring");
        obj.getMessage();
    }
}