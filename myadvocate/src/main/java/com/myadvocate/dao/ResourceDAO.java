package com.myadvocate.dao;

/**
 * Created by rahul.sachan on 15/12/15.
 */
import com.google.common.base.Optional;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.customizers.SingleValueResult;
import com.myadvocate.mappers.ResourceMapper;
import com.myadvocate.model.Resource;

import java.util.List;

/**
 * <p>
 * .
 * </p>
 *
 * @author sagyf yang
 * @version 1.0 2014-02-08 21:28
 * @since JDK 1.6
 */
@RegisterMapper(ResourceMapper.class)
public interface ResourceDAO {

    @SqlQuery("SELECT * FROM employees")
    List<Resource> findAll();

    @SqlQuery("SELECT * FROM employees WHERE id = :id")
    @SingleValueResult(Resource.class)
    Optional<Resource> findbyId(@Bind("id") long id);

}
