package com.taojinqu.manual.product.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.taojinqu.manual.handler.IFunction;
import com.taojinqu.manual.handler.MongoInvoker;

@Service("mongoService")
public class MongoService {

	@Autowired
	@Qualifier("mongoInvoker")
	private MongoInvoker invoker;

	public void insert(Object objectToSave, String collectionName) {
		invoker.invok(new IFunction<Void, MongoTemplate>() {
			@Override
			public Void call(MongoTemplate e) {
				e.insert(objectToSave, collectionName);
				return null;
			}
		});
	}

	public void insertBatch(List<? extends Object> batchToSave, String collectionName, MongoTemplate mongoTemplate) {
		invoker.invok(new IFunction<Void, MongoTemplate>() {
			@Override
			public Void call(MongoTemplate e) {
				e.insert(batchToSave, collectionName);
				return null;
			}
		});
	}

	public List<?> findAll() {
		return invoker.invok(new IFunction<List<?>, MongoTemplate>() {
			@Override
			public List<?> call(MongoTemplate e) {
				return e.findAll(Class.class);
			}
		});
	}

	public List<?> findAll(Class<?> clazz, String collectionName) {
		return invoker.invok(new IFunction<List<?>, MongoTemplate>() {
			@Override
			public List<?> call(MongoTemplate e) {
				return e.findAll(clazz, collectionName);
			}
		});
	}
}
