/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.embeddable.Login;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Cliente extends Pessoa {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;

    public Cliente() {
        this.dataCadastro = new Date();
    }

    public Cliente(String telefone, Login login, Endereco endereco) {
        super(telefone, login, endereco);
        this.dataCadastro = new Date();
    }

    public Cliente(Long id, String telefone, Login login, Endereco endereco) {
        super(id, telefone, login, endereco);
        this.dataCadastro = new Date();
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dataCadastro=" + dataCadastro + '}' + super.toString();
    }

}
