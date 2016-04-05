package com.abstracttools.web.bo.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.abstracttools.web.bo.AccountBO;
import com.abstracttools.web.db.model.Account;
import com.abstracttools.web.db.service.AccountService;

@Service
@Scope("prototype")
public class AccountBOImpl implements AccountBO {
    @Autowired
    private AccountService accountService;
    
    private static final Logger log = LoggerFactory.getLogger(AccountBOImpl.class);

    @Override
    public Account getAccount(Integer id) {
        log.debug("accountId: ", id);
        //业务处理
        return accountService.getAccountById(id);
    }

}
