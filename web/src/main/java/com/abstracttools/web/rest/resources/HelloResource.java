package com.abstracttools.web.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.abstracttools.web.bo.AccountBO;
import com.abstracttools.web.db.model.Account;

@Controller
@Scope("prototype")
@Path("hello")
public class HelloResource {
    @Autowired
    private AccountBO accountBO;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        Account account = accountBO.getAccount(154);
        return account.getEmail();
    }
}