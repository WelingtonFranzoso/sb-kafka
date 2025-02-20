package com.franzoso.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class ChatPartition1Consumer {
/*
    private final ObjectMapper objectMapper;

    public ChatPartition1Consumer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    private static final Logger LOG = LoggerFactory
            .getLogger(ChatPartition1Consumer.class);

    @KafkaListener(
            topics = "${topics.chat.request.topic2}",
            groupId = "chat-consumer-1",
            concurrency = "2"
    )
    public void consume(ConsumerRecord<?, String> consumerRecord) {
        System.out.println("\n");
        LOG.info("partition = " + consumerRecord.partition());
        LOG.info(consumerRecord.value());
    }
*/
}
