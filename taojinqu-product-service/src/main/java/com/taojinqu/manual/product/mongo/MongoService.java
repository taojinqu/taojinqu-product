package com.taojinqu.manual.product.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service("mongoService")
public class MongoService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void insert(Object objectToSave, String collectionName) {
		mongoTemplate.insert(objectToSave, collectionName);
	}

	public void insertBatch(List<? extends Object> batchToSave, String collectionName) {
		mongoTemplate.insert(batchToSave, collectionName);
	}
}
