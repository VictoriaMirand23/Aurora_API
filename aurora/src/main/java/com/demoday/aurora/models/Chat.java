package com.demoday.aurora.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "chat")
public class Chat {

    @Id
    private int id_chat;
    private String titulo;
    private LocalDateTime data_criacao;
    private String descricao;
    private int num_mensagens;
    private int id_paciente;
    private int id_profissional;
    private LocalDateTime lastupdated;
    private LocalDateTime data_conversa;
}
