/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.ValidatorDao;
import br.com.sisunit.objectvalue.ObjectValidateVo;
import br.com.sisunit.service.MotoristaService;
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
    @EJB
    private MotoristaService motoristaService;

    @Override
    public boolean validateRg(ObjectValidateVo ovv) {
        if (ovv.getId() != 0) {
            if (!motoristaService.pesquisarPeloId(ovv.getId()).getDocumentosPessoais().getRg().equals(ovv.getValue())) {
                return dao.validateRg(ovv.getValue());
            } else {
                return true;
            }
        } else {
            return dao.validateRg(ovv.getValue());
        }
    }

    @Override
    public boolean validateCpf(ObjectValidateVo ovv) {
        if (ovv.getId() != 0) {
            if (!motoristaService.pesquisarPeloId(ovv.getId()).getDocumentosPessoais().getCpf().equals(ovv.getValue())) {
                return dao.validateCpf(ovv.getValue());
            } else {
                return true;
            }
        } else {
            return dao.validateCpf(ovv.getValue());
        }
    }

    @Override
    public boolean validateEmail(ObjectValidateVo ovv) {
        if (ovv.getId() != 0) {
            if (!motoristaService.pesquisarPeloId(ovv.getId()).getContato().getEmail().equals(ovv.getValue())) {
                return dao.validateEmail(ovv.getValue());
            } else {
                return true;
            }
        } else {
            return dao.validateEmail(ovv.getValue());
        }
    }

    @Override
    public boolean validateLogin(ObjectValidateVo ovv) {
        if (ovv.getId() != 0) {
            if (!motoristaService.pesquisarPeloId(ovv.getId()).getConta().getLogin().equals(ovv.getValue())) {
                return dao.validateLogin(ovv.getValue());
            } else {
                return true;
            }
        } else {
            return dao.validateLogin(ovv.getValue());
        }
    }

}
