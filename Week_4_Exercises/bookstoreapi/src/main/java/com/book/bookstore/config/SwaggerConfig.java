package com.book.bookstoreapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.properties.SpringDocProperties;
import org.springdoc.webmvc.ui.SwaggerUiConfigParameters;

@Configuration
@Import(SpringDocProperties.class)
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public SwaggerUiConfigParameters swaggerUiConfigParameters() {
        return new SwaggerUiConfigParameters();
    }
}
