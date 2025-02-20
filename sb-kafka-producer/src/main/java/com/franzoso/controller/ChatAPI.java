package com.franzoso.controller;

import com.franzoso.dto.ChatMessageDTO;
import com.franzoso.service.ChatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatAPI {

    private final ChatService chatService;

    public ChatAPI(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public String pay (@RequestBody ChatMessageDTO chatMessage) {
        return chatService.integratePayment(chatMessage);
    }
}

