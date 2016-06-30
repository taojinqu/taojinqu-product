package com.taojinqu.manual.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component("mongoInvoker")
public class MongoInvoker {
	private static final Logger logger = LoggerFactory.getLogger(MongoInvoker.class);

	@Autowired
	private MongoTemplate template;

	public <T> T invok(IFunction<T, MongoTemplate> fun) {
		try {
			return fun.call(template);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}
}
