/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.dominio.Cliente;
import br.com.sisunit.service.ClienteService;
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
@Path("cliente")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ClienteWebService {

    @EJB
    private ClienteService clienteService;

    @GET
    public Response listClientes() {
        List<Cliente> listarClientes = clienteService.listar();
        GenericEntity<List<Cliente>> clientes = new GenericEntity<List<Cliente>>(listarClientes) {
        };
        return Response.ok(clientes).build();
    }

    @GET
    @Path("{idCliente}")
    public Response getCliente(@PathParam(value = "idCliente") Long idCliente) {
        Cliente cliente = clienteService.pesquisarPeloId(idCliente);
        return Response.ok(cliente).build();
    }

    @POST
    public Response addCliente(Cliente c) {
        Cliente cliente = clienteService.salvar(c);
        return Response.ok(cliente).build();
    }

    @POST
    @Path("{idCliente}")
    public Response removeCliente(@PathParam(value = "idCliente") Long idCliente) {
        Cliente clientePesquisado = clienteService.pesquisarPeloId(idCliente);
        Cliente cliente = clienteService.excluir(clientePesquisado);
        return Response.ok(cliente).build();
    }

    @PUT
    public Response atualizaCliente(Cliente c) {
        Cliente cliente = clienteService.atualizar(c);
        return Response.ok(cliente).build();
    }
}
