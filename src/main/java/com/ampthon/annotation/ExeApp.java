package com.ampthon.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExeApp {

    public static void main(String[] args) {
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println("Name: " + student.getName());
//        System.out.println("Age: " + student.getAge());

        AbstractApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
//        TextEditor editor = (TextEditor) context.getBean("textEditor");
//        editor.spellCheck();

        Hello hello = (Hello) context.getBean("hello");
        context.registerShutdownHook();

    }
}
