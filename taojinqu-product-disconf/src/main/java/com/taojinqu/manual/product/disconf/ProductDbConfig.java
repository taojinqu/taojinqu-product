package com.taojinqu.manual.product.disconf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration("productDbConfig")
@PropertySource("classpath:product.properties")
public class ProductDbConfig {
	@Value("${datasource.product.driver}")
	private String driver;

	@Value("${datasource.product.url}")
	private String url;

	@Value("${datasource.product.username}")
	private String username;

	@Value("${datasource.product.password}")
	private String password;

	@Value("${datasource.product.timeout}")
	private long timeout;

	@Value("${datasource.product.pool}")
	private int pool;

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public long getTimeout() {
		return timeout;
	}

	public int getPool() {
		return pool;
	}
}
