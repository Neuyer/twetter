package com.twetter.controllers;

import com.twetter.messages.MessageDeliverer;
import com.twetter.messages.MessageBringer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MessageController {

    Logger logger = LoggerFactory.getLogger(Logger.class);

    @MessageMapping("/receive")
    @SendTo("/topic/deliver")
    public MessageDeliverer messageDelive(MessageBringer messageBring){

        logger.info("recebido "+messageBring.getMessage()+" e repassando");
        MessageDeliverer messageDeliverer = new MessageDeliverer("Received: "+ messageBring.getMessage());
        return messageDeliverer;
    }
}
