package com.myadvocate.resources;

/**
 * Created by rahul.sachan on 15/12/15.
 */
import com.google.common.base.Optional;
import com.myadvocate.dao.ClientDAO;
import com.myadvocate.dao.ResourceDAO;
import com.myadvocate.model.Client;
import com.myadvocate.model.Resource;
import io.dropwizard.cli.Cli;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * <p>
 * .
 * </p>
 *
 * @author sagyf yang
 * @version 1.0 2014-02-08 22:40
 * @since JDK 1.6
 */
@Path("/resource")
@Produces(MediaType.APPLICATION_JSON)
public class ResourceResource {
    private final ResourceDAO personDAO;
    private final ClientDAO clientDAO;

    public ResourceResource(ResourceDAO dao, ClientDAO clientDAO) {
        this.personDAO = dao;
        this.clientDAO = clientDAO;
    }

    @GET
    public List<Resource> list() {
        return personDAO.findAll();
    }

    @GET
    @Path("/{ID}")
    public Optional<Resource> listById(@PathParam("ID") long id) {
        return personDAO.findbyId(id);
    }

    @GET
    @Path("/client")
    public List<Client> findAllCl(){ return clientDAO.findAllClient();}

    @POST
    @Path("/client")
    @Consumes("application/json")
    public int addClient(Client cl){
        clientDAO.addClient(cl);
        return 1;
    }


}
