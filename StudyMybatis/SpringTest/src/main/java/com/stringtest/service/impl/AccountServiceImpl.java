package com.stringtest.service.impl;

import com.stringtest.dao.IAccountDao;
import com.stringtest.domain.Account;
import com.stringtest.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    /**
     * 查询所有
     *
     * @return
     */
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    /**
     * 查询一条
     *
     * @param aid
     * @return
     */
    public Account findAccountById(Integer aid) {
        return accountDao.findAccountById(aid);
    }

    /**
     * 保存
     *
     * @param acc
     */
    public void saveAccount(Account acc) {
        accountDao.saveAccount(acc);
    }

    /**
     * 修改
     *
     * @param acc
     */
    public void updateAccount(Account acc) {
        accountDao.updateAccount(acc);
    }

    /**
     * 删除
     *
     * @param delid
     */
    public void deleteAccount(Integer delid) {
        accountDao.deleteAccount(delid);
    }

    /**
     * 转账
     *
     * @param sourceName 转出账户名称
     * @param targetName 转入账户名称
     * @param money      转账金额
     */
    public void transfer(String sourceName, String targetName, Float money) {
        // 根据转出用户名查询
        Account source = accountDao.findAccByName(sourceName);
        // 根据转入用户名查询
        Account target = accountDao.findAccByName(targetName);
        // 转出账户减钱
        source.setMoney(source.getMoney()-money);
        // 转入账户加钱
        target.setMoney(target.getMoney()+money);
        // 更新转出账户
        accountDao.updateAccount(source);
        // 更新转入账户
        accountDao.updateAccount(target);
    }
}
