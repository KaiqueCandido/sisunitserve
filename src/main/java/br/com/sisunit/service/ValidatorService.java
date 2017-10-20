/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.objectvalue.ObjectValidateVo;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
public interface ValidatorService {

    public boolean validateRg(ObjectValidateVo ovv);

    public boolean validateCpf(ObjectValidateVo ovv);

    public boolean validateEmail(ObjectValidateVo ovv);

    public boolean validateLogin(ObjectValidateVo ovv);

}
