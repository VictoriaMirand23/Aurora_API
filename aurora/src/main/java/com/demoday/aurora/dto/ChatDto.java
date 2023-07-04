package com.demoday.aurora.dto;

import com.demoday.aurora.models.Chat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatDto {

    @NotNull(message = "O ID do chat não pode ser nulo")
    private Integer id_chat;

    @NotBlank(message = "O título do chat não pode estar em branco")
    private String titulo;

    private LocalDateTime data_criacao;

    private String descricao;

    private Integer num_mensagens;

    @NotNull(message = "O ID do paciente não pode ser nulo")
    private Integer id_paciente;

    @NotNull(message = "O ID do profissional não pode ser nulo")
    private Integer id_profissional;

    private LocalDateTime lastupdated;

    private LocalDateTime data_conversa;

    public Chat parseToEntity() {
        Chat chat = new Chat();

        chat.setId_chat(this.id_chat);
        chat.setTitulo(this.titulo);
        chat.setData_criacao(this.data_criacao);
        chat.setDescricao(this.descricao);
        chat.setNum_mensagens(this.num_mensagens);
        chat.setId_paciente(this.id_paciente);
        chat.setId_profissional(this.id_profissional);
        chat.setLastupdated(this.lastupdated);
        chat.setData_conversa(this.data_conversa);

        return chat;
    }
}
