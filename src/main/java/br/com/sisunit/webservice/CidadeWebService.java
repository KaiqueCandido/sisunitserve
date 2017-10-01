/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisunit.webservice;

import br.com.sisunit.entity.Cidade;
import br.com.sisunit.service.CidadeService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */

@Path("cidade")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CidadeWebService {
    
    @EJB
    private CidadeService cidadeService;
    
    @GET
    public Response listCidade() {
        List<Cidade> listarCidades = cidadeService.listar();
        GenericEntity<List<Cidade>> cidades = new GenericEntity<List<Cidade>>(listarCidades) {
        };
        return Response.ok(cidades).build();
    }
    
    @GET
    @Path("{idEstado}")
    public Response listCidadePorEstado(@PathParam(value = "idEstado") Long idEstado) {
        List<Cidade> listarCidades = cidadeService.listarPorEstado(idEstado);
        GenericEntity<List<Cidade>> cidades = new GenericEntity<List<Cidade>>(listarCidades) {
        };
        return Response.ok(cidades).build();
    }

}
