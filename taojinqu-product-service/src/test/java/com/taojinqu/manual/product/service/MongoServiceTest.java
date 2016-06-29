package com.taojinqu.manual.product.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taojinqu.manual.product.ProductApp;
import com.taojinqu.manual.product.mongo.MongoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductApp.class)
public class MongoServiceTest extends BaseTest {

	@Autowired
	private MongoService mongoService;

	@Test
	public void testInsert() {
		mongoService.insert(null, "");
	}
}
