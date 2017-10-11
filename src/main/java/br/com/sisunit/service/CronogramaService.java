/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Cronograma;
import java.util.List;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
public interface CronogramaService {

    public Cronograma salvar(Cronograma cronograma);

    public Cronograma excluir(Cronograma cronograma);

    public Cronograma atualizar(Cronograma cronograma);

    public Cronograma pesquisarPorId(Object o);

    public List<Cronograma> listar();

}
