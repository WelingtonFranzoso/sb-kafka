package com.franzoso.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.franzoso.dto.ChatMessageDTO;
import com.franzoso.producer.ChatRequestProducer;
import org.springframework.stereotype.Service;

@Service
public class ChatService {


    private final ChatRequestProducer chatRequestProducer;

    public ChatService(ChatRequestProducer chatRequestProducer) {
        this.chatRequestProducer = chatRequestProducer;
    }

    public String integratePayment(ChatMessageDTO chatMessage) {
        try {
            return chatRequestProducer.sendMessage(chatMessage);
        } catch (JsonProcessingException e) {
            return "There was an error requesting payment "+ e.getMessage();
        }
    }
}
