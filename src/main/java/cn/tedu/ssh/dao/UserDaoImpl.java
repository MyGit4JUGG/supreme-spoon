package cn.tedu.ssh.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.tedu.ssh.bean.User;
import cn.tedu.ssh.util.HibernateUtils;

@Repository
public class UserDaoImpl 
	implements IUserDao {

	public Integer insert(User user) {
		// 1. ��ȡHibernate�е�Session����
		Session session = HibernateUtils.newSession();
		
		// 2. ִ���������ݣ�����ȡ����ֵ
		Integer id = (Integer) session.save(user);
		
		// 3. �ͷ���Դ
		HibernateUtils.closeSession(session);
		
		// 4. ����
		return id;
	}

}
