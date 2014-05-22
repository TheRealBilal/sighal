package main.java.applimedical.sighal.web.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import applimedical.sighal.business.PersonneBusiness;

@Component
@Scope("request")
public class LoginMgBean {
   @Autowired
   private PersonneBusiness personneBusiness;

}
