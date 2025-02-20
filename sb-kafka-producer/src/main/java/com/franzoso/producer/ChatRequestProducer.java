package com.franzoso.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.franzoso.dto.ChatMessageDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatRequestProducer {

    @Value("${topics.chat.request.topic}")
    private String topicChatRequest;

    @Value("${topics.chat.request.topic2}")
    private String topicChatRequest2;


    private final ObjectMapper objectMapper;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ChatRequestProducer(ObjectMapper objectMapper, KafkaTemplate<String, String> kafkaTemplate) {
        this.objectMapper = objectMapper;
        this.kafkaTemplate = kafkaTemplate;
    }

    public String sendMessage(ChatMessageDTO chatMessage) throws JsonProcessingException {
        String content = objectMapper.writeValueAsString(chatMessage);
        kafkaTemplate.send(topicChatRequest, content);
//        kafkaTemplate.send(topicChatRequest2, content);
        return "Message sent for processing";
    }
}
