/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Rota;
import java.util.List;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
public interface RotaService {

    public Rota salvar(Rota rota);

    public Rota atualizar(Rota rota);

    public Rota excluir(Rota rota);

    public Rota pesquisarPeloId(Object o);

    public List<Rota> listar();
}
