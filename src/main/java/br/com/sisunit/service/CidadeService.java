/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.entity.Cidade;
import java.util.List;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
public interface CidadeService {
    
    public Cidade pesquisarPorCodIbge(Long codibge);

    public List<Cidade> listar();

    public List<Cidade> listarPorEstado(String uf);

}
