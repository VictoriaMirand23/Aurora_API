package com.demoday.aurora.controllers;

import com.demoday.aurora.models.Profissional;
import com.demoday.aurora.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Marca como uma controladora REST ou com uma API
@RequestMapping("/Profissional") //URL base dessa controladora

public class ProfissionalControllers {

    @Autowired //Instância um novo Objeto esse em especifico conecta com o Banco de dados
    ProfissionalRepository profissionalDb;

    @CrossOrigin //Para evitar o erro de CORS
    @GetMapping("/listar")
    public List<Profissional> findAll(){
        return profissionalDb.findAll();
    }
}
