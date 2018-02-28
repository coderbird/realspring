package com.ampthon.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hello {

    private String message;

    @PostConstruct
    public void init() {
        System.out.println("init this bean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy this bean");
    }
}
