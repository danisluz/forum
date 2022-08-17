package alura.com.br.forum.config.swagger;

import alura.com.br.forum.modelo.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SweggerConfigurations {

    @Bean
    public Docket forumApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("alura.com.br.forum"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .ignoredParameterTypes(Usuario.class);
    };
}

