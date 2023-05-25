package com.cys.BeanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessorBeans.xml");
		BeanPostProcessorApp obj = (BeanPostProcessorApp) context.getBean("helloSpring");
		obj.getMessage();
		context.registerShutdownHook();
	}
}