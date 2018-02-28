package com.ampthon.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义
 */
public class CustomEvent extends ApplicationEvent{

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My Custom Event";
    }
}
