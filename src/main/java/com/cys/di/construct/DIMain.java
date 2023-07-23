package com.cys.di.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class DIMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DIConstructBeans.xml");

        TextEditor te = (TextEditor)context.getBean("textEditor");
        te.spellCheck();;
    }
}