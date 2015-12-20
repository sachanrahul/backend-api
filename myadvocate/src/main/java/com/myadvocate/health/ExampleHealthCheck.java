package com.myadvocate.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by rahul.sachan on 16/12/15.
 */
public class ExampleHealthCheck extends HealthCheck {
    private final String template;


    public ExampleHealthCheck(String name) {
        this.template = name;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
