package cn.tedu.ssh.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class HibernateUtils {
	private static SessionFactory factory;
	
	private HibernateUtils() {
	}
	
	static {
		// 1.1. 创建Configuration对象
		Configuration cfg
			= new Configuration();
		// 1.2. 读取配置文件
		cfg.configure("hibernate.cfg.xml");
		// 2.1. 获得SessionFactory
		factory	= cfg.buildSessionFactory();
	}

	public static Session newSession() {
		// 返回新的Session对象
		return factory.openSession();
	}
	
	public static void closeSession(Session session) {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
}
