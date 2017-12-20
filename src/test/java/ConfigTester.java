import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.web.context.ContextLoaderListener;

import com.mysql.jdbc.Driver;

public class ConfigTester {
	
	@SuppressWarnings("unused")
	public void test() {
		StrutsPrepareAndExecuteFilter filter;
		ContextLoaderListener listener;
		Driver driver;
		MySQLDialect dialect;
	}

}
