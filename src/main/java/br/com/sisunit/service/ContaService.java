/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Conta;
import java.util.List;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
public interface ContaService {

    public Conta salvar(Conta conta);

    public Conta excluir(Conta conta);

    public Conta atualizar(Conta conta);

    public Conta pesquisarPorId(Object o);

    public List<Conta> listar();

}
