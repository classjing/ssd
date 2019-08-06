package cn.zj.ssd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.log.LogUtils;

import cn.zj.ssd.pojo.User;
import cn.zj.ssd.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user,Model m) {
		User loginUser = userService.login(user);
		
		if(loginUser != null) {
			//使用重定向跳转到 list页面
			return "redirect:/user/list.do";
		}else {
			m.addAttribute("msg", "亲，账号密码错误！！！");
			return "forward:/login.jsp";
		}
		
	}
	
	
	@RequestMapping("/list")
	public String list(Model m) {
		m.addAttribute("username", "admin");
		
		return "user_list";
	}
}
