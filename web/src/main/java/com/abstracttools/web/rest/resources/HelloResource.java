package com.abstracttools.web.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.abstracttools.web.dao.UserMapper;

@Path("/hello")
public class HelloResource {
    @Autowired()
    UserMapper userMapper;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return userMapper.selectByPrimaryKey(1).getName();
    }
}