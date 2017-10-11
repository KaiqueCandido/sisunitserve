/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Veiculo;
import br.com.sisunit.service.VeiculoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Path("veiculo")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class VeiculoWebService {

    @EJB
    private VeiculoService veiculoService;

    @POST
    public Response salvar(Veiculo veiculo) {
        Veiculo v = veiculoService.salvar(veiculo);
        return Response.ok(v).build();
    }

    @POST
    @Path("remove")
    public Response excluir(Veiculo veiculo) {
        Veiculo v = veiculoService.excluir(veiculo);
        return Response.ok(v).build();
    }

    @PUT
    public Response atualizar(Veiculo veiculo) {
        Veiculo v = veiculoService.atualizar(veiculo);
        return Response.ok(v).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarporId(@PathParam(value = "id") Long id) {
        Veiculo veiculo = veiculoService.pesquisarPeloId(id);
        return Response.ok(veiculo).build();
    }

    @GET
    public Response listar() {
        List<Veiculo> listarVeiculos = veiculoService.listar();
        GenericEntity<List<Veiculo>> veiculos = new GenericEntity<List<Veiculo>>(listarVeiculos) {
        };
        return Response.ok(veiculos).build();
    }

}
