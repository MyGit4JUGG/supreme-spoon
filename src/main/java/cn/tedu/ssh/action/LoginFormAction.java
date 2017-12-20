package cn.tedu.ssh.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class LoginFormAction 
	extends BaseAction {

	private static final long serialVersionUID = -7058187278835159838L;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
