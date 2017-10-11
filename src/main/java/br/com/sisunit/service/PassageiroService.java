/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Passageiro;
import java.util.List;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
public interface PassageiroService {

    public Passageiro salvar(Passageiro passageiro);

    public Passageiro atualizar(Passageiro passageiro);

    public Passageiro excluir(Passageiro passageiro);

    public Passageiro pesquisarPeloId(Object o);

    public List<Passageiro> listar();
}
