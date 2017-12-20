package cn.tedu.ssh.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class HibernateUtils {
	private static SessionFactory factory;
	
	private HibernateUtils() {
	}
	
	static {
		// 1.1. ����Configuration����
		Configuration cfg
			= new Configuration();
		// 1.2. ��ȡ�����ļ�
		cfg.configure("hibernate.cfg.xml");
		// 2.1. ���SessionFactory
		factory	= cfg.buildSessionFactory();
	}

	public static Session newSession() {
		// �����µ�Session����
		return factory.openSession();
	}
	
	public static void closeSession(Session session) {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
}
