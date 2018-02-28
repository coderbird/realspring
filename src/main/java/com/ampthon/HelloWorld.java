package com.ampthon;

public class HelloWorld {

    public HelloWorld() {
        System.out.printf("who is first?\r\n");
    }

    public void getMessage() {
        System.out.printf("Your Message:" + message + "\r\n");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage2() {
        System.out.println("Your Message2:" + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void init() {
        System.out.printf("init this bean\r\n");
    }

    public void destroy() {
        System.out.printf("destroy this bean\r\n");
    }

    private String message;

    private String message2;


}
