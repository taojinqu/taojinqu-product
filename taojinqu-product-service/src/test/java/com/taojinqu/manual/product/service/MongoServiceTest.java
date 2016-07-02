package com.taojinqu.manual.product.service;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.taojinqu.manual.product.ProductApp;
import com.taojinqu.manual.product.js.ReadTestJsFile;
import com.taojinqu.manual.product.mongo.TjqMongoRepository;
import com.taojinqu.manual.product.vo.order.AliOrderVO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductApp.class)
public class MongoServiceTest extends BaseTest {

	// @Autowired
	// private MongoService mongoService;

	@Autowired
	private MongoTemplate template;

	@Autowired
	@Qualifier("tjqMongoRepository")
	private TjqMongoRepository repository;

	// @Test
	// @SuppressWarnings("unchecked")
	public void testFindAll() {
		// List<User> userList = (List<User>) mongoService.findAll(User.class,
		// "user");
		// for (User user : userList) {
		// System.out.println(user);
		// }
	}

	 @Test
	public void testInsertAliorder() {
		try {
			String aliorder = ReadTestJsFile.readFileByLines("aliorder.json");
			template.insert(aliorder, "transfer_ali_order");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testFindAliorderById() {
		try {
			// Query query = new
			// Query(Criteria.where("buyerInfo.loginId").is("ru1014327460").and("receiptAddress.zip").is("413800"));

			// Query query = new
			// Query(Criteria.where("id").is(Long.valueOf("1000430579316")));
			// Query query = new Query(Criteria.where("isPhone").is(false));
			Query query = new Query(Criteria.where("issueStatus").is("END_ISSUE"));
			String aliOrder = template.findOne(query, String.class, "user");
			System.out.println(aliOrder);

			// template.findOne(query, entityClass)
			//
			// Person p1 = mongoOps.findOne(
			// new Query(Criteria.where("name").is("PankajKr")),
			// Person.class, PERSON_COLLECTION);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void testSave() {
		try {
			String aliorder = ReadTestJsFile.readFileByLines("aliorder.json");
			AliOrderVO aliorderVo = JSON.parseObject(aliorder, AliOrderVO.class);
			long start = System.currentTimeMillis();
			AliOrderVO save = repository.save(aliorderVo);
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(save.get_id());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
