package com.cys.basic;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class MainSpring {
   public static void main(String[] args) {
      XmlBeanFactory factory = new XmlBeanFactory
                             (new ClassPathResource("Beans.xml"));
      HelloSpring obj = (HelloSpring) factory.getBean("helloSpring");
      obj.getMessage();
   }
}