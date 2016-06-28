package com.taojinqu.manual.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.taojinqu.manual.product.config.ProductAppConfig;

@SpringBootApplication(scanBasePackages = "com.taojinqu.manual.product")
@Import(ProductAppConfig.class)
public class ProductApp extends SpringBootServletInitializer implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductApp.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProductApp.class);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
