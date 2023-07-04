package com.demoday.aurora.dto;

import java.time.LocalDateTime;

import com.demoday.aurora.models.Mensagem;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MensagemDto {
     @NotNull(message = "O ID da mensagem não pode ser nulo")
    private int id_mensagem;

    @NotNull(message = "O ID do chat não pode ser nulo")
    private int id_chat;

    private LocalDateTime data_mensagem;

    @NotBlank(message = "O conteúdo da mensagem não pode estar em branco")
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

    public Mensagem parseToEntity() {
        Mensagem mensagem = new Mensagem();

        mensagem.setId_mensagem(this.id_mensagem);
        mensagem.setId_chat(this.id_chat);
        mensagem.setData_mensagem(this.data_mensagem);
        mensagem.setConteudo_mensagem(this.conteudo_mensagem);

        return mensagem;
    }
}
