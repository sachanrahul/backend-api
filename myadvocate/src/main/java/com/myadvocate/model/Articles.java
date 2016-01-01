package com.myadvocate.model;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rahul.sachan on 29/12/15.
 */

public class Articles {

    private int article_id;
    private int profile_id;
    private String article_title;
    private String article;

    public Articles(){
        article_id = 0;
        profile_id = 0;
        article_title = null;
        article = null;
    }

    public Articles(int article_id,String article_title, String article,int profile_id){
        this.profile_id = profile_id;
        this.article_id = article_id;
        this.article_title = article_title;
        this.article = article;
    }

    public Articles(int article_id, String article_title){
        this.article_id = article_id;
        this.article_title = article_title;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

}
