package cn.tedu.ssh.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class RegisterFormAction 
	extends BaseAction {

	private static final long serialVersionUID = -1467990306508485050L;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
