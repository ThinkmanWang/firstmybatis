package com.thinkman.mybatistest;

import com.thinkman.mybatistest.mapper.UserMapper;
import com.thinkman.mybatistest.models.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
		User u = userMapper.login("18621675203", "af894449f71fa7689b0bbd66bda09961");
		if (null == u) {
			System.out.println("User is NULL");
		} else {
			System.out.println(String.format("%s %s", u.getId(), u.getUser_name()));
		}
		Assert.assertEquals(2, u.getId());
	}

}