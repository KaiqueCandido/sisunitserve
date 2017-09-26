/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.dominio.PessoaJuridica;
import br.com.sisunit.service.PessoaJuridicaService;
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
@Path("pessoajuridica")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class PessoaJuridicaWebService {

    @EJB
    private PessoaJuridicaService pessoaJuridicaService;

    @GET
    public Response listPessoaJuridica() {
        List<PessoaJuridica> listarPessoaJuridica = pessoaJuridicaService.listar();
        GenericEntity<List<PessoaJuridica>> pessoasJuridicas = new GenericEntity<List<PessoaJuridica>>(listarPessoaJuridica) {
        };
        return Response.ok(pessoasJuridicas).build();
    }

    @GET
    @Path("{idPessoaJuridica}")
    public Response getPessoaJuridica(@PathParam(value = "idPessoaJuridica") Long idPessoaJuridica) {
        PessoaJuridica pessoaJuridica = pessoaJuridicaService.pesquisarPeloId(idPessoaJuridica);
        return Response.ok(pessoaJuridica).build();
    }

    @POST
    public Response addPessoaJuridica(PessoaJuridica pj) {
        PessoaJuridica pessoaJuridica = pessoaJuridicaService.salvar(pj);
        return Response.ok(pessoaJuridica).build();
    }

    @POST
    @Path("{idPessoaJuridica}")
    public Response removePessoaJuridica(@PathParam(value = "idPessoaJuridica") Long idPessoaJuridica) {
        PessoaJuridica pessoaJuridicaPesquisada = pessoaJuridicaService.pesquisarPeloId(idPessoaJuridica);
        PessoaJuridica pessoaJuridica = pessoaJuridicaService.excluir(pessoaJuridicaPesquisada);
        return Response.ok(pessoaJuridica).build();
    }

    @PUT
    public Response atualizaPessoaJuridica(PessoaJuridica pj) {
        PessoaJuridica pessoaJuridica = pessoaJuridicaService.atualizar(pj);
        return Response.ok(pessoaJuridica).build();
    }
}
