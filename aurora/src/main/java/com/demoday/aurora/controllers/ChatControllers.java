package com.demoday.aurora.controllers;

import com.demoday.aurora.models.Chat;
import com.demoday.aurora.dto.ChatDto;
import com.demoday.aurora.service.ChatService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatControllers {

    private final ChatService chatService;

    @Autowired
    public ChatControllers(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public List<Chat> findAll() {
        return chatService.findAllChats();
    }

  @PostMapping("/criar")
    public ResponseEntity<Object> createChat(@RequestBody @Valid ChatDto chatDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errorMessage.append(error.getDefaultMessage()).append("\n");
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage.toString().trim());
        }

        try {
            Chat chat = chatDto.parseToEntity();
            Chat createdChat = chatService.createChat(chat);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdChat);
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
        }
    }
}
