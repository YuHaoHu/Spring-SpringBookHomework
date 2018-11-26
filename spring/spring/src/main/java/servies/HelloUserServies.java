package servies;

/**
 * @Bean在基于Java的方法@Configuration类
 */
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import pojo.Boy;
import pojo.User;

@Controller
public class HelloUserServies {

	@Bean
	public Boy boy() {
		Boy boy = new Boy();
		boy.setSex("男");
		return boy;
	}

	@Bean
	public User user() {
		User user = new User();
		user.setUname("胡玉浩");
		user.setUage("18");
		return user;
	}
}
