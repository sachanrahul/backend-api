package com.myadvocate.dao;

import com.myadvocate.mappers.AdvocateCategoryMapper;
import com.myadvocate.model.AdvocateCategory;
import com.myadvocate.model.Client;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by rahul.sachan on 21/12/15.
 */
@RegisterMapper(AdvocateCategoryMapper.class)
public interface AdvocateCategoryDAO {
    final String tableName = "ad_advocate_category";
    @SqlQuery("SELECT * FROM " + tableName +" where is_display=\'1\'")
    List<AdvocateCategory> findCategory();
}
