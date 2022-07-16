package com.kurdi.springbootwebsocket.models;

import org.springframework.web.util.HtmlUtils;

public class Message {

    private String name;
    private String message;
    private String content;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message() {
    }

    public Message(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent(){
        return HtmlUtils.htmlEscape(name+ ", ") + HtmlUtils.htmlEscape(message);
    }
}