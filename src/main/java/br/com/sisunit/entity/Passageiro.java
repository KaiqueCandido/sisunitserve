/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.embeddable.Contato;
import br.com.sisunit.embeddable.DocumentosPessoais;
import br.com.sisunit.enums.SexoEnum;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Kaique Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Passageiro extends Pessoa {

    @Column(length = 125)
    private String matricula;

    public Passageiro() {
    }

    public Passageiro(String matricula, String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        super(nome, sobrenome, dataDeNascimento, sexo, documentosPessoais, contato, endereco);
        this.matricula = matricula;
    }

    public Passageiro(String matricula, Long id, String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        super(id, nome, sobrenome, dataDeNascimento, sexo, documentosPessoais, contato, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Pessoa {" + super.toString() + " Passageiro{" + "matricula=" + matricula + '}';
    }

}
