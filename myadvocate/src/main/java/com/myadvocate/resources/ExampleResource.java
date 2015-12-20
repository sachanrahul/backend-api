package com.myadvocate.resources;

/**
 * Created by rahul.sachan on 15/12/15.
 */
/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013-2014 sagyf Yang. The Four Group.
 */

import java.util.concurrent.atomic.AtomicLong;


import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.myadvocate.model.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>
 * .
 * </p>
 *
 * @author sagyf yang
 * @version 1.0 2014-02-08 20:45
 * @since JDK 1.6
 */
@Path("/example")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

    private final String template;

    private final String defaultName;

    private final AtomicLong counter;

    public ExampleResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        return new Saying(counter.incrementAndGet(),
                String.format(template, name.or(defaultName)));
    }

}