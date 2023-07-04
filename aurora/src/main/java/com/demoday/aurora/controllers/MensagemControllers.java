package com.demoday.aurora.controllers;

import com.demoday.aurora.models.Mensagem;
import com.demoday.aurora.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensagemControllers {

    @Autowired
    MensagemRepository mensagemDb;

    @CrossOrigin
    @GetMapping
    public List<Mensagem> findAll(){
        return mensagemDb.findAll();
    }
}
