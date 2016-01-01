package com.myadvocate.resources;

import com.myadvocate.dao.AdvocateCategoryDAO;
import com.myadvocate.dao.ResourceDAO;
import com.myadvocate.model.AdvocateCategory;
import com.myadvocate.model.Client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by rahul.sachan on 21/12/15.
 */
@Path("/category")
@Produces(MediaType.APPLICATION_JSON)
public class AdvocateCategoryResource {
    private final AdvocateCategoryDAO acDAO;

    public AdvocateCategoryResource(AdvocateCategoryDAO acDAO) {
        this.acDAO = acDAO;
    }

    @GET
    public List<AdvocateCategory> list(){
        return acDAO.findCategory();
    }


}
