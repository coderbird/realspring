package com.ampthon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
//        ApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        ApplicationContext context = new FileSystemXmlApplicationContext("target/classes/Beans.xml");
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();
//        obj.setMessage("fuck");
//        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
//        obj1.getMessage();
//
//        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
//        objB.getMessage1();
//        objB.getMessage2();
//        objB.getMessage3();
//
//        context.registerShutdownHook();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");
        javaCollection.getAddressList();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
        javaCollection.getAddressSet();
    }
}
