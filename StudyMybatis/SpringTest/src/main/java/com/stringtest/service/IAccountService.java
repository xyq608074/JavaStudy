package com.stringtest.service;


import com.stringtest.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一条
     * @return
     */
    Account findAccountById(Integer aid);

    /**
     * 保存
     * @param acc
     */
    void saveAccount(Account acc);

    /**
     * 修改
     * @param acc
     */
    void updateAccount(Account acc);

    /**
     * 删除
     * @param delid
     */
    void deleteAccount(Integer delid);
}
