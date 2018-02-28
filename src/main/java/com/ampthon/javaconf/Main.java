package com.ampthon.javaconf;

import com.ampthon.annotation.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        HelloWorld helloWorld = context.getBean(HelloWorld.class);
//        helloWorld.getMessage();
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.spellCheck();
    }


}
