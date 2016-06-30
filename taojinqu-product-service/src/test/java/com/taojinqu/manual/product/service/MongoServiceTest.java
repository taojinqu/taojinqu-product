package com.taojinqu.manual.product.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taojinqu.manual.product.ProductApp;
import com.taojinqu.manual.product.mongo.MongoService;
import com.taojinqu.manual.product.mongo.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductApp.class)
public class MongoServiceTest extends BaseTest {

	@Autowired
	private MongoService mongoService;

	@Test
	public void testInsert() {
		User user = new User();
		user.setName("梁新叶");
		user.setCity_of_birth("湖南省郴州市永兴县");
		user.setProfession("liangxianfu");
		mongoService.insert(user, "user");
	}

	@Test
	public void testFindAll() {
		List<User> userList = mongoService.findAll(User.class, "user");
		for (User user : userList) {
			System.out.println(user);
		}
	}
}
