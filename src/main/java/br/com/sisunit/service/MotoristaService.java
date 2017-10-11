/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Motorista;
import java.util.List;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
public interface MotoristaService {

    public Motorista salvar(Motorista motorista);

    public Motorista atualizar(Motorista motorista);

    public Motorista excluir(Motorista motorista);

    public Motorista pesquisarPeloId(Object o);

    public List<Motorista> listar();
}
