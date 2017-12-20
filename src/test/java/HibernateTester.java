import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import cn.tedu.ssh.bean.User;
import cn.tedu.ssh.util.HibernateUtils;

public class HibernateTester {
	
	@SuppressWarnings("unchecked")
	@Test
	public void login() {
		// 1. ͨ��HibernateUtils�еķ�����ȡSession����
		Session session = HibernateUtils.newSession();
				
		// 2.1. ׼��HQL���
		String hql = "FROM User u "
				+ "WHERE u.username=? "
				+ "AND u.password=?";
		// 2.2. ͨ��Session���󴴽���ѯ����
		Query<User> query = session.createQuery(hql);
		query.setParameter(0, "Frank");
		query.setParameter(1, "frank1234");
		// 2.3. ִ�в�ѯ
		List<User> users = query.list();
				
		// 3. �ر�Session
		HibernateUtils.closeSession(session);
		
		// 4. ������
		boolean result = users.size() == 1;
				
		// ����
		System.out.println("login() ��" + result);
//		for (User user : users) {
//			System.out.println("\t" + user);
//		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void queryAllUser() {
		// 1. ͨ��HibernateUtils�еķ�����ȡSession����
		Session session = HibernateUtils.newSession();
		
		// 2.1. ׼��HQL���
		String hql = "FROM User";
		// 2.2. ͨ��Session���󴴽���ѯ����
		Query<User> query = session.createQuery(hql);
		// 2.3. ִ�в�ѯ
		List<User> users = query.list();
		
		// 3. �ر�Session
		HibernateUtils.closeSession(session);
		
		// ����
		System.out.println("queryAllUser() ��");
		for (User user : users) {
			System.out.println("\t" + user);
		}
	}
	
	// Transaction(����)
	@Test
	public void testTransaction() {
		// 1. ͨ��HibernateUtils�еķ�����ȡSession����
		Session session = HibernateUtils.newSession();
		
		// 2.1. ׼����ʼִ������
		Transaction tx = session.beginTransaction();
		// 2.2. ��Ҫִ�е�һϵ�����ݲ���
		session.save(new User("Gia", "gia1234", "13800138007", "gia@tedu.cn"));
		session.save(new User("Edison", "edison1234", "13800138005", "edison@tedu.cn"));
		session.save(new User("Henry", "henry1234", "13800138008", "henry@tedu.cn"));
		// 2.3. �ύ����
		tx.commit();
		
		// 3. �ر�Session
		HibernateUtils.closeSession(session);
	}
	
	@Test
	public void getUserById() {
		// 1. ͨ��HibernateUtils�еķ�����ȡSession����
		Session session = HibernateUtils.newSession();
		
		// 2. ͨ��Session�����ȡ����
		User user = session.get(User.class, 2);
		
		// 3. �ر�Session
		HibernateUtils.closeSession(session);
		
		// 4. �����ȡ������
		System.out.println("getUserById() -> " + user);
	}

	@Test
	public void addUser() {
		// 1.1 ͨ��HibernateUtils�еķ�����ȡSession����
		Session session = HibernateUtils.newSession();
		
		// 2.1. ������Ҫ�����User����
		User user = new User(
			"Billy",
			"billy1234",
			"13800138002",
			"billy@tedu.cn"
		);
		
		// 3.1. ִ��
		Integer id = (Integer) session.save(user);
		
		// 4.1. �ͷ���Դ
		HibernateUtils.closeSession(session);
		
		// ���
		System.out.println("addUser() -> id=" + id);
	}
	
}
