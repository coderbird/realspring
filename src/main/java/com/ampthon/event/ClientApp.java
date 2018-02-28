package com.ampthon.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ClientApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");

        context.start();
        MyHello myHello = (MyHello) context.getBean("myHello");
        myHello.getMessage();
        context.stop();
    }



}
