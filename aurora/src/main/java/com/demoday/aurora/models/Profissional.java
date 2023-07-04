package com.demoday.aurora.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "Profissional")
public class Profissional {

    @Id
    private int id_profissional;
    private String username_profissional;
    private String nome_profissional;
    private LocalDate data_profissional;
    private int CPF_profissional;
    private String email_profissional;
    private int id_endereco;
    private int ddd_profissional;
    private int tel_profissional;
    private String genero_profissional;
    private String senha_profissional;
    private String crp;
    private Timestamp lastupdated;
    private Timestamp created_at;

    public int getId_profissional() {
        return id_profissional;
    }

    public void setId_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
    }

    public String getUsername_profissional() {
        return username_profissional;
    }

    public void setUsername_profissional(String username_profissional) {
        this.username_profissional = username_profissional;
    }

    public String getNome_profissional() {
        return nome_profissional;
    }

    public void setNome_profissional(String nome_profissional) {
        this.nome_profissional = nome_profissional;
    }

    public LocalDate getData_profissional() {
        return data_profissional;
    }

    public void setData_profissional(LocalDate data_profissional) {
        this.data_profissional = data_profissional;
    }

    public int getCPF_profissional() {
        return CPF_profissional;
    }

    public void setCPF_profissional(int CPF_profissional) {
        this.CPF_profissional = CPF_profissional;
    }

    public String getEmail_profissional() {
        return email_profissional;
    }

    public void setEmail_profissional(String email_profissional) {
        this.email_profissional = email_profissional;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public int getDdd_profissional() {
        return ddd_profissional;
    }

    public void setDdd_profissional(int ddd_profissional) {
        this.ddd_profissional = ddd_profissional;
    }

    public int getTel_profissional() {
        return tel_profissional;
    }

    public void setTel_profissional(int tel_profissional) {
        this.tel_profissional = tel_profissional;
    }

    public String getGenero_profissional() {
        return genero_profissional;
    }

    public void setGenero_profissional(String genero_profissional) {
        this.genero_profissional = genero_profissional;
    }

    public String getSenha_profissional() {
        return senha_profissional;
    }

    public void setSenha_profissional(String senha_profissional) {
        this.senha_profissional = senha_profissional;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
