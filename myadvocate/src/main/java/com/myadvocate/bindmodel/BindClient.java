package com.myadvocate.bindmodel;

import com.myadvocate.model.Client;
import org.skife.jdbi.v2.SQLStatement;
import org.skife.jdbi.v2.sqlobject.BinderFactory;
import org.skife.jdbi.v2.sqlobject.BindingAnnotation;

import javax.xml.bind.Binder;
import java.lang.annotation.*;


/**
 * Created by rahul.sachan on 20/12/15.
 */
//@BindingAnnotation(BindClient.UserBinderFactory.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface BindClient {

}
