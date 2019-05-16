package com.mybatis.one2many.dao;

import com.mybatis.one2many.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有用户
      * @return
     */
    @Select("select * from user")
    List<User> findAll();


    @Select("select * from user where userid=#{id}")
    User findById(Integer id);
}
