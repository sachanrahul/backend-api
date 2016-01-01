package com.myadvocate.mappers;

import com.myadvocate.model.Articles;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rahul.sachan on 30/12/15.
 */
public class ArticleTitleMapper implements ResultSetMapper<Articles>{
    @Override
    public Articles map(int i, ResultSet r, StatementContext statementContext) throws SQLException {
        return new Articles(r.getInt("article_id"),
                r.getString("article_title"));
    }
}
