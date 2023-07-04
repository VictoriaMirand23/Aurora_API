package com.demoday.aurora.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensagem")
public class Mensagem {

    @Id
    private int id_mensagem;
    private int id_chat;
    private LocalDateTime data_mensagem;
    private String conteudo_mensagem;

    public int getId_mensagem() {
        return id_mensagem;
    }

    public void setId_mensagem(int id_mensagem) {
        this.id_mensagem = id_mensagem;
    }

    public int getId_chat() {
        return id_chat;
    }

    public void setId_chat(int id_chat) {
        this.id_chat = id_chat;
    }

    public LocalDateTime getData_mensagem() {
        return data_mensagem;
    }

    public void setData_mensagem(LocalDateTime data_mensagem) {
        this.data_mensagem = data_mensagem;
    }

    public String getConteudo_mensagem() {
        return conteudo_mensagem;
    }

    public void setConteudo_mensagem(String conteudo_mensagem) {
        this.conteudo_mensagem = conteudo_mensagem;
    }
}
