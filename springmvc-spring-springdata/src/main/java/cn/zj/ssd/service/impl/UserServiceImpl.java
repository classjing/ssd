package cn.zj.ssd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zj.ssd.dao.UserRepository;
import cn.zj.ssd.pojo.User;
import cn.zj.ssd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User login(User user) {
		return userRepository.findByNameAndPassword(user.getName(), user.getPassword());
	}

}
