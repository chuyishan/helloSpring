package com.cys.basic;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class MainSpring {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloSpring obj = (HelloSpring)factory.getBean("helloSpring");
        obj.getMessage();
    }
}