/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Conta;
import br.com.sisunit.service.ContaService;
import java.util.List;
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
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Path("conta")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ContaWebService {

    private ContaService contaService;

    @POST
    public Response salvar(Conta conta) {
        Conta c = contaService.salvar(conta);
        return Response.ok(c).build();
    }

    @POST
    @Path("remove")
    public Response excluir(Conta conta) {
        Conta c = contaService.excluir(conta);
        return Response.ok(c).build();
    }

    @PUT
    public Response atualizar(Conta conta) {
        Conta c = contaService.atualizar(conta);
        return Response.ok(c).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarPorId(@PathParam(value = "id") Long id) {
        Conta c = contaService.pesquisarPorId(id);
        return Response.ok(c).build();
    }

    @GET
    public Response listar() {
        List<Conta> contas = contaService.listar();
        GenericEntity<List<Conta>> contasEntity = new GenericEntity<List<Conta>>(contas) {
        };
        return Response.ok(contasEntity).build();
    }

}
