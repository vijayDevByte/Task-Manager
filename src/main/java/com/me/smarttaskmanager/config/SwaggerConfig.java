package com.me.smarttaskmanager.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8081");
        devServer.setDescription("Server url in dev environment");
        Server prodServer = new Server();
        prodServer.setUrl("http://localhost:8081");
        prodServer.setDescription("Server url in production environment");
        Contact contact = new Contact();
        contact.setEmail("vijay.spm.07@gmail.com");
        contact.setName("Vijay");
        contact.setUrl("https://Extremes.com");

        License multLicense = new License().name("Vijay Licence").url("");
        // Info info = new Info().title("TASK
        // MANAGER").version("1.0.0").contact(contact).description("This API endpoints")
        // .termsOfService("https:extremes.com").license(multLicense);
        Info info = new Info().title("TASK MANAGER").version("1.0.0").contact(contact).description("This API endpoints")
                .termsOfService("https:extremes.com").license(multLicense);

        return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
    }

}
