package com.myadvocate.dao;

import com.myadvocate.mappers.ClientMappre;
import com.myadvocate.model.Client;
import io.dropwizard.cli.Cli;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by rahul.sachan on 18/12/15.
 */

@RegisterMapper(ClientMappre.class)
public interface ClientDAO {

    String tableName = "ad_advocate_profile";
    @SqlQuery("SELECT * FROM " + tableName)
    List<Client> findAllClient();

    @SqlUpdate("insert into "+ tableName +" (name,age,experience,address,city,state,image,office_add,contact_no,email,dob,gender) " +
            "values(:p.name,:p.age,:p.experience,:p.address,:p.city,:p.state,:p.image,:p.office_add,:p.contact_no,:p.email,:p.dob,:p.gender)")
    @GetGeneratedKeys
    public long addClient1(@BindBean("p") Client client);

}
