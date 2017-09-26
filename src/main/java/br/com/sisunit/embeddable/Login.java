/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.embeddable;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Embeddable
public class Login implements Serializable {

    @Column(length = 125)
    private String email;
    @Column(length = 125)
    private String senha;
    private String foto;

    public Login() {
    }

    public Login(String email, String senha, String foto) {
        this.email = email;
        this.senha = senha;
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
