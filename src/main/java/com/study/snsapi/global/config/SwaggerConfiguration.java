package com.study.snsapi.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    private String group;
    private String title;

    @Bean
    public GroupedOpenApi apiHello() {
        group = "Hello";
        title = "SNS API " + group;
        return GroupedOpenApi.builder()
                .group(group)
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI api() {
        group = "v1";
        title = "SNS API " + group;
        return new OpenAPI()
                .info(new Info()
                        .title(title)
                        .description("SNS API")
                        .version(group)
                );
    }
}
