package net.ddns.freakyvicky.tmserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableAutoConfiguration
@EnableSwagger2
@SpringBootApplication
public class Application extends SpringApplication {

    private static final String LABEL_SERVER_PORT = "server.port";
    private static final String DEFAULT_PORT = "8080";

    public static void main(String[] args) {

        String port;

        if (args.length > 1) {
            port = args[1];
        } else {
            port = DEFAULT_PORT;
        }

        new SpringApplicationBuilder(Application.class)
                .properties(LABEL_SERVER_PORT, port)
                .registerShutdownHook(true)
                .run(args);
    }

}
