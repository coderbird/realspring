package com.ampthon.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserDefineApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
        customEventPublisher.publish();
        customEventPublisher.publish();

    }


}
