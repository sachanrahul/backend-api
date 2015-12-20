package com.myadvocate.mappers;

/**
 * Created by rahul.sachan on 15/12/15.
 */
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.myadvocate.model.Resource;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p>
 * .
 * </p>
 *
 * @author sagyf yang
 * @version 1.0 2014-02-08 22:46
 * @since JDK 1.6
 */
public class ResourceMapper implements ResultSetMapper<Resource> {
    @Override
    public Resource map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new Resource(resultSet.getLong("id"), resultSet.getString("first_name"),resultSet.getString("last_name"),resultSet.getString("e_position"));
    }
}
