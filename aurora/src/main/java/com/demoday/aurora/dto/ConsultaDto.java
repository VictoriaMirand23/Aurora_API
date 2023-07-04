package com.demoday.aurora.dto;

import java.time.LocalDateTime;

import com.demoday.aurora.models.Consulta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ConsultaDto {
    @NotNull(message = "O ID do profissional não pode ser nulo")
    private int id_profissional;

    @NotNull(message = "O ID do paciente não pode ser nulo")
    private int id_paciente;

    private LocalDateTime data_consulta;

    @NotBlank(message = "A observação da consulta não pode estar em branco")
    private String observacao;

    public int getId_profissional() {
        return id_profissional;
    }

    public void setId_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public LocalDateTime getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(LocalDateTime data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Consulta parseToEntity() {
        Consulta consulta = new Consulta();

        consulta.setId_profissional(this.id_profissional);
        consulta.setId_paciente(this.id_paciente);
        consulta.setData_consulta(this.data_consulta);
        consulta.setObservacao(this.observacao);

        return consulta;
    }
}
