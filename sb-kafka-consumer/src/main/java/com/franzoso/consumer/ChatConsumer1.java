package com.franzoso.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.franzoso.dto.ChatMessageDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ChatConsumer1 {


    private final ObjectMapper objectMapper;

    public ChatConsumer1(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @KafkaListener(
            topics = "${topics.chat.request.topic}",
            groupId = "chat-consumer-1"
    )
    public void consume(String message) throws JsonProcessingException {
        System.out.println("KAFKA CONS 1 ==================" + new Date());
        ChatMessageDTO messageDTO = objectMapper.readValue(message, ChatMessageDTO.class);
        String messageTemplate = "FROM: %s, TO: %s \nTITLE: %s\nCONTENT: %s";
        System.out.printf(
                messageTemplate,
                messageDTO.getFrom(),
                messageDTO.getTo(),
                messageDTO.getTitle(),
                messageDTO.getContent()
        );
        System.out.println("\n==================");
    }


}
