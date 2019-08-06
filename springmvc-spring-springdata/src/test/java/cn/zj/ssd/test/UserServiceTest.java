package cn.zj.ssd.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zj.ssd.pojo.User;
import cn.zj.ssd.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-data.xml")
public class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testLogin() {
		
		
		
		User user = new User();
		user.setName("admin");
		user.setPassword("123");
		User loginUser = userService.login(user);
		System.out.println(loginUser);
	}

}
