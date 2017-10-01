/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.exeption;

import br.com.sisunit.entity.Permissao;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
public class PermissaoException extends Exception {

    private Permissao permissao;

    public PermissaoException() {
    }

    public PermissaoException(Permissao permissao, String message) {
        super(message);
        this.permissao = permissao;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

}
