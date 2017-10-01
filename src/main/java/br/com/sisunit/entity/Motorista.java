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
 * @author Kaique oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Motorista extends Pessoa {

    @Column(length = 125)
    private String codCnh;

    public Motorista() {
    }

    public Motorista(String codCnh, String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        super(nome, sobrenome, dataDeNascimento, sexo, documentosPessoais, contato, endereco);
        this.codCnh = codCnh;
    }

    public Motorista(String codCnh, Long id, String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        super(id, nome, sobrenome, dataDeNascimento, sexo, documentosPessoais, contato, endereco);
        this.codCnh = codCnh;
    }

    public String getCodCnh() {
        return codCnh;
    }

    public void setCodCnh(String codCnh) {
        this.codCnh = codCnh;
    }

    @Override
    public String toString() {
        return "Pessoa {" + super.toString() + " Motorista{" + "codCnh=" + codCnh + '}';
    }

}
