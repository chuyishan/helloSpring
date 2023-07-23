package com.cys.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author ZhengZhihua
 *
 */
public class FileApp {
    public static void main(String[] args) {
        ApplicationContext context =
            new FileSystemXmlApplicationContext(" D:/WorkNet/JavaSpace/helloSpring/src/main/java/Beans.xml");
        HelloSpring obj = (HelloSpring)context.getBean("helloSpring");
        obj.getMessage();
    }
}