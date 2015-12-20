package com.myadvocate.dao;

import com.myadvocate.mappers.ClientMappre;
import com.myadvocate.model.Client;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import com.google.common.base.Optional;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.customizers.SingleValueResult;
import com.myadvocate.mappers.ResourceMapper;
import com.myadvocate.model.Resource;

import java.util.List;

/**
 * Created by rahul.sachan on 18/12/15.
 */

@RegisterMapper(ClientMappre.class)
public interface ClientDAO {

    @SqlQuery("SELECT * FROM client")
    List<Client> findAllClient();

    @SqlQuery("select * from client(:client.fname,:client.mname,:client.lname,:client.age,:client.experience,:client.address)")
    @GetGeneratedKeys
    public int addClient(@BindBean("client") Client client);

}
