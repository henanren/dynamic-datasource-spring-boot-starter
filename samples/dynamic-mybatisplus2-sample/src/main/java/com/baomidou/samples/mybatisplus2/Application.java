package com.baomidou.samples.mybatisplus2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.baomidou.samples.mybatisplus2.entity.User;
import com.baomidou.samples.mybatisplus2.service.UserService;

@SpringBootApplication
@MapperScan("com.baomidou.samples.mybatisplus2.mapper")
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		test(context);
	}

	public static void test(ConfigurableApplicationContext context) {

		UserService userService = context.getBean(UserService.class);
		// User user = new User();
		// user.setAge((int) Math.random());
		// user.setName("myName" + (int) Math.random());
		// userService.addUser(user);

		for (int i = 0; i < 10; i++) {
			User user1 = userService.selectById(1);
			System.out.println(i + "  :  " + user1.getName());
		}

	}

}