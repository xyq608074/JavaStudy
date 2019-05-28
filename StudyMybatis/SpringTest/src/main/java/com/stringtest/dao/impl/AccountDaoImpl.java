package com.stringtest.dao.impl;

import com.stringtest.dao.IAccountDao;
import com.stringtest.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;


@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private QueryRunner runner;


    /**
     * 查询所有
     *
     * @return
     */
    public List<Account> findAllAccount() {
        try {
            return runner.query("select * from accuser",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 查询一条
     *
     * @param aid
     * @return
     */
    public Account findAccountById(Integer aid) {
        try {
            return runner.query("select * from accuser where id=?",new BeanHandler<Account>(Account.class),aid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 保存
     *
     * @param acc
     */
    public void saveAccount(Account acc) {
        try {
            runner.update("insert into accuser value(null,?,?)",acc.getName(),acc.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 修改
     *
     * @param acc
     */
    public void updateAccount(Account acc) {
        try {
            runner.update("update accuser set name=?,money=? where id=?",acc.getName(),acc.getMoney(),acc.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 删除
     *
     * @param delid
     */
    public void deleteAccount(Integer delid) {
        try {
            runner.update("delete from accuser where id=?",delid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据名称查询
     *
     * @param name
     * @return
     */
    public Account findAccByName(String name) {
        try {
            List<Account> namelist = runner.query("select * from accuser where name=?", new BeanListHandler<Account>(Account.class), name);

            if (namelist==null || namelist.size()==0){
                return null;
            }
            if (namelist.size()>1){
                throw new RuntimeException("结果集不唯一");
            }
            return namelist.get(0);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
