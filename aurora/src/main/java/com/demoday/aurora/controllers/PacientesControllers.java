package com.demoday.aurora.controllers;

import com.demoday.aurora.models.Pacientes;
import com.demoday.aurora.repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Marcar como uma controladora REST ou como uma API
@RequestMapping("/pacientes") //URL base dessa controladora
public class PacientesControllers {

    @Autowired //Instância um novo Objeto esse em especifico conecta com o Banco de dados
    PacientesRepository pacientesDb;

    @CrossOrigin //Para evitar o erro de CORS
    @GetMapping("/listar")
    public List<Pacientes> findAll(){

        return pacientesDb.findAll();
    }

}
