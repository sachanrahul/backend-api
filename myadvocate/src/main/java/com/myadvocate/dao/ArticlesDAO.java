package com.myadvocate.dao;

import com.google.common.base.Optional;
import com.myadvocate.mappers.ArticleTitleMapper;
import com.myadvocate.mappers.ArticlesMapper;
import com.myadvocate.model.Articles;
import com.myadvocate.model.Client;
import com.myadvocate.model.Resource;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.customizers.SingleValueResult;

import java.util.List;

/**
 * Created by rahul.sachan on 29/12/15.
 */
@RegisterMapper(ArticlesMapper.class)
public interface ArticlesDAO {

    String tableName = "ad_articles";
    @SqlQuery("SELECT * FROM " + tableName)
    List<Articles> getAllArticles();

    @SqlQuery("Select * from ad_articles where article_id= :article_id")
    @SingleValueResult(Articles.class)
    Optional<Articles> getArticle(@Bind("article_id") int article_id);

}
