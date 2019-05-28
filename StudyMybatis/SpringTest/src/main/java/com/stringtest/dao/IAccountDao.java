package com.stringtest.dao;

import com.stringtest.domain.Account;

import java.util.List;

public interface IAccountDao  {

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

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    Account findAccByName(String name);
}
