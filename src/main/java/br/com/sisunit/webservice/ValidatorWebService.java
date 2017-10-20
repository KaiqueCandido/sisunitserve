/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.objectvalue.ObjectValidateVo;
import br.com.sisunit.service.ValidatorService;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Path("validator")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ValidatorWebService {

    @EJB
    private ValidatorService validatorService;

    @POST
    @Path("rg")
    public Response validateRg(ObjectValidateVo ovv) {
        if (validatorService.validateRg(ovv)) {
            return Response.ok().build();
        } else {
            return Response.status(Status.NOT_ACCEPTABLE).build();
        }
    }

    @POST
    @Path("cpf")
    public Response validateCpf(ObjectValidateVo ovv) {
        if (validatorService.validateCpf(ovv)) {
            return Response.ok().build();
        } else {
            return Response.status(Status.NOT_ACCEPTABLE).build();
        }
    }

    @POST
    @Path("email")
    public Response validateEmail(ObjectValidateVo ovv) {
        if (validatorService.validateEmail(ovv)) {
            return Response.ok().build();
        } else {
            return Response.status(Status.NOT_ACCEPTABLE).build();
        }
    }

    @POST
    @Path("login")
    public Response validateLogin(ObjectValidateVo ovv) {
        if (validatorService.validateLogin(ovv)) {
            return Response.ok().build();
        } else {
            return Response.status(Status.NOT_ACCEPTABLE).build();
        }
    }

}
