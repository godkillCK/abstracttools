package com.abstracttools.web.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.abstracttools.web.db.mapper.AccountMapper;
import com.abstracttools.web.db.model.Account;

@Repository
@Scope("prototype")
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public Account getAccountById(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}
