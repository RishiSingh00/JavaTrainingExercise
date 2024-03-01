package com.edu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.edu.spring.ConstSetExample;
import com.edu.spring.ConstMapExample;

public class TestSetMapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("setMap.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		ConstSetExample egSet = (ConstSetExample) factory.getBean("set");
		ConstMapExample egMap = (ConstMapExample) factory.getBean("map");
		egSet.display();
		System.out.println("------------------");
		egMap.display();
	}
}
