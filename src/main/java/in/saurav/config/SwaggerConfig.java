package in.saurav.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
//import com.sun.tools.javac.util.List;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI mycustomConfig() {
		return new OpenAPI().info(
			new Info().title("Journal App APIs")
			.description("By Saurav"))
			.servers(Arrays.asList(new Server().url("http://localhost:8080").description("local"),
					new Server().url("http://localhost:8082").description("live")));
	}
}
