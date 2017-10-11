/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.embeddable.Contato;
import br.com.sisunit.embeddable.DocumentosPessoais;
import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.enums.SexoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Gestor extends Pessoa {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeCadastro;

    public Gestor() {
        this.dataDeCadastro = new Date();
    }

    public Gestor(String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, Conta conta, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        super(nome, sobrenome, dataDeNascimento, sexo, conta, documentosPessoais, contato, endereco);
        this.dataDeCadastro = new Date();
    }

    public Gestor(Long id, String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, Conta conta, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        super(id, nome, sobrenome, dataDeNascimento, sexo, conta, documentosPessoais, contato, endereco);
        this.dataDeCadastro = new Date();
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    @Override
    public String toString() {
        return "Pessoa {" + super.toString() + " Gestor{" + "dataDeCadastro=" + dataDeCadastro + '}';
    }

}
