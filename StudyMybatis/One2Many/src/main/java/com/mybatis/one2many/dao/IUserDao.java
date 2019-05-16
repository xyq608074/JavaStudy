package com.mybatis.one2many.dao;

import com.mybatis.one2many.domain.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有用户
      * @return
     */
    @Select("select * from user")
    @Results(id = "UserMap",value = {
            @Result(id = true,column = "userid",property = "userid"),
            @Result(column = "username",property = "username"),
            @Result(column = "useraddr",property = "useraddr"),
            @Result(column = "usersex",property = "usersex"),
            @Result(column = "userbirthday",property = "userbirthday"),
            @Result(property = "acc",column = "userid",
                    many = @Many(select = "com.mybatis.one2many.dao.IAccountDao.findByUid",
                            fetchType = FetchType.LAZY))
    })
    List<User> findAll();


    @Select("select * from user where userid=#{accuid}")
    User findById(Integer accuid);
}
