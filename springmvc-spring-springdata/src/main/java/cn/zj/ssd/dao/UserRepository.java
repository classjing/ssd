package cn.zj.ssd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.zj.ssd.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByNameAndPassword(String name,String passwrd);

}
