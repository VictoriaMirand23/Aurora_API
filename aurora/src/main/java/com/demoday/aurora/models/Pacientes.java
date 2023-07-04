package com.demoday.aurora.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "paciente")
public class Pacientes {

    @Id
    private int id_paciente;
    private String username_paciente;
    private String nome_paciente;
    private int data_paciente;
    private int CPF_paciente;
    private String email_paciente;
    private int tel_paciente;
    private String genero_paciente;
    private String senha_paciente;
    private int id_endereco;
    private String hobbies;
    private int id_hobby;
    private Timestamp created_at;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getUsername_paciente() {
        return username_paciente;
    }

    public void setUsername_paciente(String username_paciente) {
        this.username_paciente = username_paciente;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public int getData_paciente() {
        return data_paciente;
    }

    public void setData_paciente(int data_paciente) {
        this.data_paciente = data_paciente;
    }

    public int getCPF_paciente() {
        return CPF_paciente;
    }

    public void setCPF_paciente(int CPF_paciente) {
        this.CPF_paciente = CPF_paciente;
    }

    public String getEmail_paciente() {
        return email_paciente;
    }

    public void setEmail_paciente(String email_paciente) {
        this.email_paciente = email_paciente;
    }

    public int getTel_paciente() {
        return tel_paciente;
    }

    public void setTel_paciente(int tel_paciente) {
        this.tel_paciente = tel_paciente;
    }

    public String getGenero_paciente() {
        return genero_paciente;
    }

    public void setGenero_paciente(String genero_paciente) {
        this.genero_paciente = genero_paciente;
    }

    public String getSenha_paciente() {
        return senha_paciente;
    }

    public void setSenha_paciente(String senha_paciente) {
        this.senha_paciente = senha_paciente;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getId_hobby() {
        return id_hobby;
    }

    public void setId_hobby(int id_hobby) {
        this.id_hobby = id_hobby;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
