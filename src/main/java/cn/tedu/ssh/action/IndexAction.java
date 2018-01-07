package cn.tedu.ssh.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class IndexAction 
	extends BaseAction {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("IndexAction.execute()");
		return SUCCESS;
	}
	
}
