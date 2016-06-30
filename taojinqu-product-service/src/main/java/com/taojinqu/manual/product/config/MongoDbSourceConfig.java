package com.taojinqu.manual.product.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.taojinqu.manual.product.disconf.MongoConfig;

@Configuration
public class MongoDbSourceConfig {
	private Logger logger = LoggerFactory.getLogger(MongoDbSourceConfig.class);

	public Map<String, MongoTemplate> temp;

	@Autowired
	private MongoConfig mongoConfig;

	@Bean(name = "mongoDbFactory")
	public MongoDbFactory buildMongoDbFactory() throws Exception {
		List<ServerAddress> serverList = new ArrayList<ServerAddress>();
		try {
			serverList.add(new ServerAddress(mongoConfig.getMongoHost(), mongoConfig.getMongoPort()));

			List<MongoCredential> credsList = new ArrayList<MongoCredential>();
			credsList.add(MongoCredential.createCredential(mongoConfig.getMongoUserName(),
					mongoConfig.getMongoDatabse(), mongoConfig.getMongoPassword().toCharArray()));

			MongoClient mongoclient = new MongoClient(serverList, credsList);
			return new SimpleMongoDbFactory(mongoclient, mongoConfig.getMongoDatabse());
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}

	@Bean(name = "mongoTemplate")
	public MongoTemplate buildMongoTemplate(MongoDbFactory mongoDbFactory) throws Exception {
		DbRefResolver resolver = new DefaultDbRefResolver(mongoDbFactory);

		MappingMongoConverter converter = new MappingMongoConverter(resolver, new MongoMappingContext());
		converter.setTypeMapper(new DefaultMongoTypeMapper(null)); // 每个document会自动增加_class字段，值为实体的完整包路径，如：com.taojinqu.manual.product.mongo.domain.User
		// converter.setTypeMapper(new DefaultMongoTypeMapper());
		converter.afterPropertiesSet();

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);
		return mongoTemplate;
	}
}
