package com.demoday.aurora.controllers;

import com.demoday.aurora.models.Consulta;
import com.demoday.aurora.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Marcar como uma controladora REST ou como uma API
@RequestMapping("/consulta")
@RestController
public class ConsultaControllers {
    @Autowired //Instância um novo Objeto esse em especifico conecta com o Banco de dados
    ConsultaRepository consultaDb;

    @CrossOrigin //Para evitar o erro de CORS
    @GetMapping("/listar")
    public List<Consulta> findAll(){
        return consultaDb.findAll();
    }

}
