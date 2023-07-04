package com.demoday.aurora.dto;

import com.demoday.aurora.models.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EnderecoDto {
    
    @NotNull(message = "O ID do endereço não pode ser nulo")
    private int id_endereco;

    @NotNull(message = "O CEP não pode ser nulo")
    private int CEP;

    @NotBlank(message = "O estado não pode estar em branco")
    private String estado;

    @NotBlank(message = "A cidade não pode estar em branco")
    private String cidade;

    @NotBlank(message = "O bairro não pode estar em branco")
    private String bairro;

    @NotBlank(message = "A rua não pode estar em branco")
    private String rua;

    @NotNull(message = "O número não pode ser nulo")
    private int numero;

    private String complemento;

    @NotNull(message = "O ID do paciente não pode ser nulo")
    private int id_paciente;

    @NotNull(message = "O ID do profissional não pode ser nulo")
    private int id_profissional;

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_profissional() {
        return id_profissional;
    }

    public void setId_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
    }

    public Endereco parseToEntity() {
        Endereco endereco = new Endereco();

        endereco.setId_endereco(this.id_endereco);
        endereco.setCEP(this.CEP);
        endereco.setEstado(this.estado);
        endereco.setCidade(this.cidade);
        endereco.setBairro(this.bairro);
        endereco.setRua(this.rua);
        endereco.setNumero(this.numero);
        endereco.setComplemento(this.complemento);
        endereco.setId_paciente(this.id_paciente);
        endereco.setId_profissional(this.id_profissional);

        return endereco;
    }
}

