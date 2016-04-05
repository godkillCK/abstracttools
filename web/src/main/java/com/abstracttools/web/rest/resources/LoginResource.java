package com.abstracttools.web.rest.resources;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.abstracttools.web.bo.impl.AccountBOImpl;
import com.abstracttools.web.weibo4j.Oauth;
import com.abstracttools.web.weibo4j.model.WeiboException;
import com.abstracttools.web.weibo4j.util.BareBonesBrowserLaunch;

@Controller
@Scope("prototype")
@Path("login")
public class LoginResource
{
    private static Logger Log = LoggerFactory.getLogger(AccountBOImpl.class);
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String login()
    {
        try
        {
            Oauth oauth = new Oauth();
            BareBonesBrowserLaunch.openURL(oauth.authorize("code"));
            System.out.println(oauth.authorize("code"));
            System.out.print("Hit enter when it's done.[Enter]:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String code = br.readLine();
            Log.info("code: " + code);
            System.out.println(oauth.getAccessTokenByCode(code));
        }
        catch (WeiboException e)
        {
            if (401 == e.getStatusCode())
            {
                Log.info("Unable to get the access token.");
            }
            else
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return "0";
    }
}