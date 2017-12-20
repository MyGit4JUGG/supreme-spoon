package cn.tedu.ssh.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.tedu.ssh.bean.User;
import cn.tedu.ssh.service.UserService;

@Controller
@Scope("prototype")
public class RegisterAction
	extends BaseAction {

	private static final long serialVersionUID 
		= 5063703431243270805L;
	private User user;
	@Resource
	private UserService userService;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		// ����
		System.out.println("RegisterAction.execute() -> " + user);
		
		// ͨ��Serviceִ��ע�ᣬ����ȡ���
		int result = userService.register(user);
		
		// �ж�Service��ִ�н��
		if (result >= 1) {
			// ����
			System.out.println("RegisterAction.execute() -> return : " + SUCCESS);
			
			// ����Session
			getSession().put("username", user.getUsername());
			
			// ����
			return SUCCESS;
		} else {
			System.out.println("RegisterAction.execute() -> return : " + ERROR);
			return ERROR;
		}
	}

}
