package com.abstracttools.web.db.model;

import java.util.Date;

public class Account {
    private Integer id;

    private String email;

    private String mobile;

    private String loginpwd;

    private String signpwd;

    private Integer type;

    private Integer status;

    private String authproject;

    private Integer projrnlevel;

    private Date createdate;

    private Date modifydate;

    private Integer personid;

    private Integer organizeid;

    private String pwdrequest;

    private String pwdanswer;

    private Double balance;

    private Double rate;

    private Integer overbalance;

    private String alipayid;

    private Double paycoin;

    private String rejreason;

    private Double checkprice;

    private String bankaccount;

    private String banknum;

    private String bank;

    private String head;

    private String alertset;

    private String pwdrequest2;

    private String pwdanswer2;

    private String accountuid;

    private Integer checktimes;

    private Integer authority;

    private Double totalupload;

    private Integer version;

    private Integer year;

    private Integer month;

    private Integer day;

    private Integer week;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getSignpwd() {
        return signpwd;
    }

    public void setSignpwd(String signpwd) {
        this.signpwd = signpwd == null ? null : signpwd.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuthproject() {
        return authproject;
    }

    public void setAuthproject(String authproject) {
        this.authproject = authproject == null ? null : authproject.trim();
    }

    public Integer getProjrnlevel() {
        return projrnlevel;
    }

    public void setProjrnlevel(Integer projrnlevel) {
        this.projrnlevel = projrnlevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public Integer getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(Integer organizeid) {
        this.organizeid = organizeid;
    }

    public String getPwdrequest() {
        return pwdrequest;
    }

    public void setPwdrequest(String pwdrequest) {
        this.pwdrequest = pwdrequest == null ? null : pwdrequest.trim();
    }

    public String getPwdanswer() {
        return pwdanswer;
    }

    public void setPwdanswer(String pwdanswer) {
        this.pwdanswer = pwdanswer == null ? null : pwdanswer.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getOverbalance() {
        return overbalance;
    }

    public void setOverbalance(Integer overbalance) {
        this.overbalance = overbalance;
    }

    public String getAlipayid() {
        return alipayid;
    }

    public void setAlipayid(String alipayid) {
        this.alipayid = alipayid == null ? null : alipayid.trim();
    }

    public Double getPaycoin() {
        return paycoin;
    }

    public void setPaycoin(Double paycoin) {
        this.paycoin = paycoin;
    }

    public String getRejreason() {
        return rejreason;
    }

    public void setRejreason(String rejreason) {
        this.rejreason = rejreason == null ? null : rejreason.trim();
    }

    public Double getCheckprice() {
        return checkprice;
    }

    public void setCheckprice(Double checkprice) {
        this.checkprice = checkprice;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getBanknum() {
        return banknum;
    }

    public void setBanknum(String banknum) {
        this.banknum = banknum == null ? null : banknum.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getAlertset() {
        return alertset;
    }

    public void setAlertset(String alertset) {
        this.alertset = alertset == null ? null : alertset.trim();
    }

    public String getPwdrequest2() {
        return pwdrequest2;
    }

    public void setPwdrequest2(String pwdrequest2) {
        this.pwdrequest2 = pwdrequest2 == null ? null : pwdrequest2.trim();
    }

    public String getPwdanswer2() {
        return pwdanswer2;
    }

    public void setPwdanswer2(String pwdanswer2) {
        this.pwdanswer2 = pwdanswer2 == null ? null : pwdanswer2.trim();
    }

    public String getAccountuid() {
        return accountuid;
    }

    public void setAccountuid(String accountuid) {
        this.accountuid = accountuid == null ? null : accountuid.trim();
    }

    public Integer getChecktimes() {
        return checktimes;
    }

    public void setChecktimes(Integer checktimes) {
        this.checktimes = checktimes;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public Double getTotalupload() {
        return totalupload;
    }

    public void setTotalupload(Double totalupload) {
        this.totalupload = totalupload;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }
}