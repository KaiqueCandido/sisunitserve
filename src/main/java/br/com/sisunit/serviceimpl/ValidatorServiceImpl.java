/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.ValidatorDao;
import br.com.sisunit.service.ValidatorService;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(ValidatorService.class)
public class ValidatorServiceImpl implements ValidatorService {

    @EJB
    private ValidatorDao dao;

    @Override
    public boolean validateRg(String value) {
        return dao.validateRg(value);
    }

    @Override
    public boolean validateCpf(String value) {
        return dao.validateCpf(value);
    }

    @Override
    public boolean validateEmail(String value) {
        return dao.validateEmail(value);
    }

    @Override
    public boolean validateLogin(String value) {
        return dao.validateLogin(value);
    }

 


}
