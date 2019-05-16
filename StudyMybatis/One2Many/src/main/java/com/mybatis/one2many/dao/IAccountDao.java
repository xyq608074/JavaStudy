package com.mybatis.one2many.dao;

import com.mybatis.one2many.domain.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IAccountDao {

    /**
     * 查询所有账号
     * @return
     */
    @Select("select * from account")
    @Results(id="accountMap",value = {
            @Result(id = true,column="accid",property = "accid"),
            @Result(column = "accuid" ,property = "accuid"),
            @Result(column = "accmoney",property = "accmoney"),
            @Result(property = "user",column = "accuid",one = @One(select = "com.mybatis.one2many.dao.IUserDao.findById",fetchType = FetchType.EAGER))
    })
    List<Account> findAll();
}
