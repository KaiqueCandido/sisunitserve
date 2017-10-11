/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Gestor;
import java.util.List;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
public interface GestorService {

    public Gestor salvar(Gestor gestor);

    public Gestor excluir(Gestor gestor);

    public Gestor atualizar(Gestor gestor);

    public Gestor pesquisarPorId(Object o);

    public List<Gestor> listar();

}
