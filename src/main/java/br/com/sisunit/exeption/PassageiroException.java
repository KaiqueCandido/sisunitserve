/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.exeption;

import br.com.sisunit.entity.Passageiro;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
public class PassageiroException extends Exception {

    private Passageiro passageiro;

    public PassageiroException() {
    }

    public PassageiroException(Passageiro passageiro, String message) {
        super(message);
        this.passageiro = passageiro;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

}
