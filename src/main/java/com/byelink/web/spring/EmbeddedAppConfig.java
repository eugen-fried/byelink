package com.byelink.web.spring;

import com.byelink.web.persistence.dao.ByeLinkDao;
import com.byelink.web.persistence.dao.ByeLinkGaeDao;
import com.byelink.security.domain.AuthenticationResolver;
import com.byelink.web.controller.ByeLinkController;
import com.byelink.web.controller.HelpController;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by : doron
 * Since: 7/1/12
 */

@Configuration
@Import({EmbeddedAppVelocityBeansConfig.class})
public class EmbeddedAppConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public ByeLinkController byeLinkController() {
        return new ByeLinkController();
    }

    @Bean
    public HelpController helloWorldController() {
        return new HelpController();
    }

    @Bean
    public ByeLinkDao byeLinkDao() {
        return new ByeLinkGaeDao();
    }

    @Bean
    public DatastoreService dataStore() {
        return DatastoreServiceFactory.getDatastoreService();
    }

    @Bean
    public AuthenticationResolver authenticationResolver() {
        return new AuthenticationResolver(objectMapper());
    }
}
