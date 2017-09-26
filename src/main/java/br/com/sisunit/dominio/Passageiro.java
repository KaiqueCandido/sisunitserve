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
public class Passageiro extends Pessoa {

    @Column(length = 125)
    private String matricula;
    @Column(length = 125)
    private String cpf;
    @Column(length = 225)
    private String nome;
    @Column(length = 25)
    @Enumerated(EnumType.STRING)
    private Genero sexo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    public Passageiro() {
    }

    public Passageiro(String matricula, String cpf, String nome, Genero sexo, Date dataNascimento, String telefone, Login login, Endereco endereco) {
        super(telefone, login, endereco);
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Passageiro(String matricula, String cpf, String nome, Genero sexo, Date dataNascimento, Long id, String telefone, Login login, Endereco endereco) {
        super(id, telefone, login, endereco);
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public Genero getSexo() {
        return sexo;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + '}' + super.toString();
    }

}
