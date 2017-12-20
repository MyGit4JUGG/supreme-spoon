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
		// TODO ҵ���ж�
		
		// �������
		System.out.println("UserServiceImpl.register() -> " + user);
		
		// ִ��ע��
		Integer id = userDao.insert(user);
		
		// ����
		return id;
	}

}
