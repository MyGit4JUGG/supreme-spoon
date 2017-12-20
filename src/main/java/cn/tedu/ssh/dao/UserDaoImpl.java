package cn.tedu.ssh.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.tedu.ssh.bean.User;
import cn.tedu.ssh.util.HibernateUtils;

@Repository
public class UserDaoImpl 
	implements IUserDao {

	public Integer insert(User user) {
		// 1. 获取Hibernate中的Session对象
		Session session = HibernateUtils.newSession();
		
		// 2. 执行增加数据，并获取返回值
		Integer id = (Integer) session.save(user);
		
		// 3. 释放资源
		HibernateUtils.closeSession(session);
		
		// 4. 返回
		return id;
	}

}
