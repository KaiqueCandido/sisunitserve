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

    @GET
    public Response listVeiculo() {
        List<Veiculo> listarVeiculos = veiculoService.listar();
        GenericEntity<List<Veiculo>> veiculos = new GenericEntity<List<Veiculo>>(listarVeiculos) {
        };
        return Response.ok(veiculos).build();
    }

    @GET
    @Path("{idVeiculo}")
    public Response getVeiculo(@PathParam(value = "idVeiculo") Long idVeiculo) {
        Veiculo veiculo = veiculoService.pesquisarPeloId(idVeiculo);
        return Response.ok(veiculo).build();
    }

    @POST
    public Response addVeiculo(Veiculo v) {
        Veiculo veiculo = veiculoService.salvar(v);
        return Response.ok(veiculo).build();
    }

    @POST
    @Path("{idVeiculo}")
    public Response removeVeiculo(@PathParam(value = "idVeiculo") Long idVeiculo) {
        Veiculo veiculoSelecionado = veiculoService.pesquisarPeloId(idVeiculo);
        Veiculo veiculo = veiculoService.excluir(veiculoSelecionado);
        return Response.ok(veiculo).build();
    }

    @PUT
    public Response atualizaVeiculo(Veiculo v) {
        Veiculo veiculo = veiculoService.atualizar(v);
        return Response.ok(veiculo).build();
    }
}
