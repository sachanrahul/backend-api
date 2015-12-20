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
    public Client map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new Client(resultSet.getString("fName"), resultSet.getString("mName"), resultSet.getString("lName"),resultSet.getInt("age"),resultSet.getFloat("experience"),resultSet.getString("address"));
    }
}
