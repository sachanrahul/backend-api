package com.myadvocate.resources;

import com.google.common.base.Optional;
import com.myadvocate.dao.ArticleTitleDAO;
import com.myadvocate.dao.ArticlesDAO;
import com.myadvocate.model.Articles;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by rahul.sachan on 29/12/15.
 */
@Path("/articles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleResource {
    private ArticlesDAO articlesDAO;
    private ArticleTitleDAO articleTitleDAO;
    public ArticleResource(ArticlesDAO articlesDAO, ArticleTitleDAO articleTitleDAO){
        this.articlesDAO = articlesDAO;
        this.articleTitleDAO = articleTitleDAO;
    }

    @GET
    public List<Articles> getArticles(){
        return articlesDAO.getAllArticles();
    }

    @GET
    @Path("/{article_id}")
    public Optional<Articles> getArticleByID(@PathParam("article_id") int article_id){
        return articlesDAO.getArticle(article_id);
    }

    @GET
    @Path("/titles")
    public List<Articles> getArticleTitle(){
        return articleTitleDAO.getArticleTitle();
    }
}
