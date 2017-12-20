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
		// 1. 通过HibernateUtils中的方法获取Session对象
		Session session = HibernateUtils.newSession();
				
		// 2.1. 准备HQL语句
		String hql = "FROM User u "
				+ "WHERE u.username=? "
				+ "AND u.password=?";
		// 2.2. 通过Session对象创建查询对象
		Query<User> query = session.createQuery(hql);
		query.setParameter(0, "Frank");
		query.setParameter(1, "frank1234");
		// 2.3. 执行查询
		List<User> users = query.list();
				
		// 3. 关闭Session
		HibernateUtils.closeSession(session);
		
		// 4. 处理结果
		boolean result = users.size() == 1;
				
		// 测试
		System.out.println("login() ：" + result);
//		for (User user : users) {
//			System.out.println("\t" + user);
//		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void queryAllUser() {
		// 1. 通过HibernateUtils中的方法获取Session对象
		Session session = HibernateUtils.newSession();
		
		// 2.1. 准备HQL语句
		String hql = "FROM User";
		// 2.2. 通过Session对象创建查询对象
		Query<User> query = session.createQuery(hql);
		// 2.3. 执行查询
		List<User> users = query.list();
		
		// 3. 关闭Session
		HibernateUtils.closeSession(session);
		
		// 测试
		System.out.println("queryAllUser() ：");
		for (User user : users) {
			System.out.println("\t" + user);
		}
	}
	
	// Transaction(事务)
	@Test
	public void testTransaction() {
		// 1. 通过HibernateUtils中的方法获取Session对象
		Session session = HibernateUtils.newSession();
		
		// 2.1. 准备开始执行事务
		Transaction tx = session.beginTransaction();
		// 2.2. 需要执行的一系列数据操作
		session.save(new User("Gia", "gia1234", "13800138007", "gia@tedu.cn"));
		session.save(new User("Edison", "edison1234", "13800138005", "edison@tedu.cn"));
		session.save(new User("Henry", "henry1234", "13800138008", "henry@tedu.cn"));
		// 2.3. 提交事务
		tx.commit();
		
		// 3. 关闭Session
		HibernateUtils.closeSession(session);
	}
	
	@Test
	public void getUserById() {
		// 1. 通过HibernateUtils中的方法获取Session对象
		Session session = HibernateUtils.newSession();
		
		// 2. 通过Session对象获取数据
		User user = session.get(User.class, 2);
		
		// 3. 关闭Session
		HibernateUtils.closeSession(session);
		
		// 4. 处理获取的数据
		System.out.println("getUserById() -> " + user);
	}

	@Test
	public void addUser() {
		// 1.1 通过HibernateUtils中的方法获取Session对象
		Session session = HibernateUtils.newSession();
		
		// 2.1. 创建需要保存的User对象
		User user = new User(
			"Billy",
			"billy1234",
			"13800138002",
			"billy@tedu.cn"
		);
		
		// 3.1. 执行
		Integer id = (Integer) session.save(user);
		
		// 4.1. 释放资源
		HibernateUtils.closeSession(session);
		
		// 输出
		System.out.println("addUser() -> id=" + id);
	}
	
}
