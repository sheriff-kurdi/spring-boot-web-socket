package com.kurdi.springbootwebsocket.controllers;

import com.kurdi.springbootwebsocket.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {


    @MessageMapping("/chat")
    //@SendTo("/topic/greetings")
    @SendTo("/chat/public")
    public Message chat(Message message) throws Exception {
        Thread.sleep(1000); // simulated delay
        //return new Greeting(message.messageContent());
        return message;
    }

}