package applimedical.sighal.web.utils;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("appBean")
@Scope("globalSession")
public class AppMgBean {
	
	public Date now(){
		return new Date();
	}

}
