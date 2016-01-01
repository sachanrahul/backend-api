package com.myadvocate.mappers;

import com.myadvocate.model.AdvocateCategory;
import com.myadvocate.model.Client;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rahul.sachan on 21/12/15.
 */
public class AdvocateCategoryMapper implements ResultSetMapper<AdvocateCategory> {
    @Override
    public AdvocateCategory map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new AdvocateCategory(resultSet.getString("category"), resultSet.getString("image_name"),resultSet.getInt("is_display"));
    }
}
