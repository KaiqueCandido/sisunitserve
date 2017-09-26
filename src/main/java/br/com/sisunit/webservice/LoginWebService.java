/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.exeption.LoginException;
import br.com.sisunit.embeddable.Login;
import br.com.sisunit.dominio.Pessoa;
import br.com.sisunit.service.LoginService;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Path(value = "login")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class LoginWebService {

    @EJB
    private LoginService loginService;

    @POST
    public Response autenticacao(Login login) {
        try {
            Pessoa pessoa = loginService.logar(login.getEmail(), login.getSenha());
            if (pessoa != null) {
                return Response.ok(pessoa)
                        .header("pessoaType", getNameClass(pessoa.getClass().getTypeName()))
                        .build();
            } else {
                return Response.status(Response.Status.NO_CONTENT).build();
            }
        } catch (LoginException exception) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
    }

    public String getNameClass(String caminho) {
        String[] aux = caminho.split("\\.");
        return aux[aux.length - 1].toLowerCase();
    }

}
