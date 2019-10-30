package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Timestamp;

/**
 * @author yanweijin
 * @date 2017/9/13
 */
@Configuration
@EnableSwagger2
@Profile({"!release", "!production", "!master"})
public class Swagger2Configuration {

    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${primus.application.version:'1.0.0'}")
    private String serviceVersion;

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.tensquare"))
                .paths(PathSelectors.any())
                .build()
                .directModelSubstitute(Timestamp.class, Long.class);
    }

    @Bean
    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("api docs : service-" + serviceName).version(serviceVersion).build();
    }

}
