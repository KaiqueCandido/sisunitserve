/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.exeption;

import br.com.sisunit.entity.PontoDeParada;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
public class PontoDeParadaException extends Exception {

    private PontoDeParada pontoDeParada;

    public PontoDeParadaException() {
    }

    public PontoDeParadaException(PontoDeParada pontoDeParada, String message) {
        super(message);
        this.pontoDeParada = pontoDeParada;
    }

    public PontoDeParada getPontoDeParada() {
        return pontoDeParada;
    }

    public void setPontoDeParada(PontoDeParada pontoDeParada) {
        this.pontoDeParada = pontoDeParada;
    }

}
