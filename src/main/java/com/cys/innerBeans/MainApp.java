package com.cys.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBeans.xml");
        TextEditor te = (TextEditor)context.getBean("textEditor");
        te.spellCheck();
    }
}