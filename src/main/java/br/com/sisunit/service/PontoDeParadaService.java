/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.PontoDeParada;
import java.util.List;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
public interface PontoDeParadaService {

    public PontoDeParada salvar(PontoDeParada pontoDeParada);

    public PontoDeParada atualizar(PontoDeParada pontoDeParada);

    public PontoDeParada excluir(PontoDeParada pontoDeParada);

    public PontoDeParada pesquisarPeloId(Object o);

    public List<PontoDeParada> listar();
}
