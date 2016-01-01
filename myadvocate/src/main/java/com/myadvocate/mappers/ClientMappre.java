package com.myadvocate.mappers;

import com.myadvocate.model.Client;
import com.myadvocate.model.Resource;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rahul.sachan on 17/12/15.
 */
public class ClientMappre implements ResultSetMapper<Client>{
    @Override
    public Client map(int i, ResultSet r, StatementContext statementContext) throws SQLException {
        return new Client(r.getInt("profile_id"),
                r.getString("name"),
                r.getInt("age"),
                r.getFloat("experience"),
                r.getString("address"),
                r.getString("city"),
                r.getString("state"),
                r.getString("image"),
                r.getString("office_add"),
                r.getString("contact_no"),
                r.getString("email"),
                r.getDate("dob"),
                r.getString("gender"));
    }
}
