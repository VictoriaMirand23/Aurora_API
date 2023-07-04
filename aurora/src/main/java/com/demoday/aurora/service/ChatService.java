package com.demoday.aurora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoday.aurora.models.Chat;
import com.demoday.aurora.repository.ChatRepository;

@Service
public class ChatService {
    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public List<Chat> findAllChats() {
        return chatRepository.findAll();
    }

    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }
}
