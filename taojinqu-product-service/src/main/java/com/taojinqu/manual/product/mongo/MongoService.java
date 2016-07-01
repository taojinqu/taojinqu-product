package com.taojinqu.manual.product.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.taojinqu.manual.handler.IFunction;
import com.taojinqu.manual.handler.MongoInvoker;

//@Service("mongoService")
public class MongoService {

	@Autowired
	private MongoInvoker mongoInvoker;

	public void insert(Object objectToSave, String collectionName) {
		mongoInvoker.invok(new IFunction<Void, MongoTemplate>() {
			@Override
			public Void call(MongoTemplate e) {
				e.insert(objectToSave, collectionName);
				return null;
			}
		});
	}

	public void insertBatch(List<? extends Object> batchToSave, String collectionName, MongoTemplate mongoTemplate) {
		mongoInvoker.invok(new IFunction<Void, MongoTemplate>() {
			@Override
			public Void call(MongoTemplate e) {
				e.insert(batchToSave, collectionName);
				return null;
			}
		});
	}

	public List<?> findAll() {
		return mongoInvoker.invok(new IFunction<List<?>, MongoTemplate>() {
			@Override
			public List<?> call(MongoTemplate e) {
				return e.findAll(Class.class);
			}
		});
	}

	public List<?> findAll(Class<?> clazz, String collectionName) {
		return mongoInvoker.invok(new IFunction<List<?>, MongoTemplate>() {
			@Override
			public List<?> call(MongoTemplate e) {
				return e.findAll(clazz, collectionName);
			}
		});
	}
}
