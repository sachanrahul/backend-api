package com.myadvocate.mappers;

import com.google.common.base.Optional;
import com.myadvocate.model.Articles;
import com.myadvocate.model.Client;
import org.omg.PortableInterceptor.INACTIVE;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by rahul.sachan on 29/12/15.
 */
public class ArticlesMapper implements ResultSetMapper<Articles> {
    @Override
    public Articles map(int i, ResultSet r, StatementContext statementContext) throws SQLException {
        return new Articles(r.getInt("article_id"),
                r.getString("article_title"),
                r.getString("article"),
                r.getInt("profile_id"));
    }
}
