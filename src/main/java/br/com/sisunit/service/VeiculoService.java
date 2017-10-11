/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Veiculo;
import java.util.List;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
public interface VeiculoService {

    public Veiculo salvar(Veiculo veiculo);

    public Veiculo atualizar(Veiculo veiculo);

    public Veiculo excluir(Veiculo veiculo);

    public Veiculo pesquisarPeloId(Object o);

    public List<Veiculo> listar();
}
