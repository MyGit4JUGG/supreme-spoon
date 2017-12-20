package cn.tedu.ssh.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tedu.ssh.bean.User;
import cn.tedu.ssh.dao.IUserDao;

@Service("userService")
public class UserServiceImpl 
	implements UserService {
	
	@Resource
	private IUserDao userDao;

	public Integer register(User user) {
		// TODO ÒµÎñÅÐ¶Ï
		
		// ²âÊÔÊä³ö
		System.out.println("UserServiceImpl.register() -> " + user);
		
		// Ö´ÐÐ×¢²á
		Integer id = userDao.insert(user);
		
		// ·µ»Ø
		return id;
	}

}
