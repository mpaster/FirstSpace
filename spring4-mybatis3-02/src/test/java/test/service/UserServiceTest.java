package test.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.mpaster.model.User;
import com.mpaster.service.IUserService;

public class UserServiceTest {

	private static Logger logger = Logger.getLogger(UserServiceTest.class);
	private ApplicationContext ac = null;
	private IUserService userService = null;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userService = (IUserService)ac.getBean("userService");
	}

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));  
	}
	
	@Test
	public void test2() {
		List<User> users = userService.getAll();
		logger.info(users);  
	}
}
