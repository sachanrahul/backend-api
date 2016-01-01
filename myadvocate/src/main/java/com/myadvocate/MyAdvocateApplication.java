package com.myadvocate;

/**
 * Created by rahul.sachan on 15/12/15.
 */
import com.myadvocate.dao.*;
import com.myadvocate.model.Articles;
import com.myadvocate.resources.AdvocateCategoryResource;
import com.myadvocate.resources.ArticleResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.skife.jdbi.v2.DBI;
import com.myadvocate.resources.ExampleResource;
import com.myadvocate.resources.AdvocateResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAdvocateApplication extends Application<MyAdvocateConfiguration> {
    private static Logger logger = LoggerFactory.getLogger(MyAdvocateApplication.class);
    public static void main(String[] args) throws Exception {
        new MyAdvocateApplication().run(args);
    }

    @Override
    public String getName() {
        return "example";
    }

    @Override
    public void initialize(Bootstrap<MyAdvocateConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle());
        bootstrap.addBundle(new MigrationsBundle<MyAdvocateConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(MyAdvocateConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(MyAdvocateConfiguration configuration,
                    Environment environment) {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi;
        try {
            jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        final ResourceDAO dao = jdbi.onDemand(ResourceDAO.class);
        final ClientDAO cdao = jdbi.onDemand(ClientDAO.class);
        final ArticlesDAO ado = jdbi.onDemand(ArticlesDAO.class);
        final AdvocateCategoryDAO acdao = jdbi.onDemand(AdvocateCategoryDAO.class);
        final ArticleTitleDAO atado = jdbi.onDemand(ArticleTitleDAO.class);
        logger.error("Error while fetching configuration details");
        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();
        environment.jersey().register(new ExampleResource(template, defaultName));
        environment.jersey().register(new AdvocateResource(dao,cdao,ado));
        environment.jersey().register(new AdvocateCategoryResource(acdao));
        environment.jersey().register(new ArticleResource(ado,atado));
       // environment.healthChecks().register("template", new ExampleHealthCheck(template));
    }
}
