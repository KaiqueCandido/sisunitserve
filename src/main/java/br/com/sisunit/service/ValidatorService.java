/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
public interface ValidatorService {

    public boolean validateRg(String value);

    public boolean validateCpf(String value);

    public boolean validateEmail(String value);

    public boolean validateLogin(String value);

}
