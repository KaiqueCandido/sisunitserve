/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.embeddable.Login;
import br.com.sisunit.enums.Genero;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Motorista extends Pessoa {

    @Column(length = 125)
    private String cpf;
    @Column(length = 225)
    private String nome;
    @Column(length = 25)
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @Column(length = 125)
    private String cnh;

    public Motorista() {
    }

    public Motorista(String cpf, String nome, Genero genero, Date dataNascimento, String cnh, String telefone, Login login, Endereco endereco) {
        super(telefone, login, endereco);
        this.cpf = cpf;
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.cnh = cnh;
    }

    public Motorista(String cpf, String nome, Genero genero, Date dataNascimento, String cnh, Long id, String telefone, Login login, Endereco endereco) {
        super(id, telefone, login, endereco);
        this.cpf = cpf;
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Motorista{" + "cpf=" + cpf + ", nome=" + nome + ", genero=" + genero + ", dataNascimento=" + dataNascimento + ", cnh=" + cnh + '}' + super.toString();
    }

}
