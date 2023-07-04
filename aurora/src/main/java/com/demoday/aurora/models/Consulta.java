package com.demoday.aurora.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "consulta")
public class Consulta {
    @Id
    private int id_profissional;
    private int id_paciente;
    private LocalDateTime data_consulta;
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
}
