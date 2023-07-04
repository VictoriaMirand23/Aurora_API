package com.demoday.aurora.controllers;

import com.demoday.aurora.models.Endereco;
import com.demoday.aurora.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoControllers {

    @Autowired
    EnderecoRepository enderecoDb;

    @CrossOrigin
    @GetMapping("/listar")
    public List<Endereco> findAll(){

        return enderecoDb.findAll();
    }
}
