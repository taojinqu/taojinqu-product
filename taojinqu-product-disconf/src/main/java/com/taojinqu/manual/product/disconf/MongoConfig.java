package com.taojinqu.manual.product.disconf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration("mongoConfig")
@PropertySource("classpath:mongo.properties")
public class MongoConfig {

	@Value("${mongo.host}")
	private String mongoHost;

	@Value("${mongo.port}")
	private Integer mongoPort;

	@Value("${mongo.database}")
	private String mongoDatabse;

	@Value("${mongo.username}")
	private String mongoUserName;

	@Value("${mongo.password}")
	private String mongoPassword;

	public String getMongoHost() {
		return mongoHost;
	}

	public Integer getMongoPort() {
		return mongoPort;
	}

	public String getMongoDatabse() {
		return mongoDatabse;
	}

	public String getMongoUserName() {
		return mongoUserName;
	}

	public String getMongoPassword() {
		return mongoPassword;
	}
}
