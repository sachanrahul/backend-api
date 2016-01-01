package com.myadvocate.dao;

import com.myadvocate.mappers.ArticleTitleMapper;
import com.myadvocate.model.Articles;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by rahul.sachan on 30/12/15.
 */
@RegisterMapper(ArticleTitleMapper.class)
public interface ArticleTitleDAO {

    @SqlQuery("SELECT  article_id ,article_title FROM ad_articles")
    List<Articles> getArticleTitle();
}
