package com.mybatisstudy.dao;

import com.mybatisstudy.domain.Student;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface IStudentDao {

    /**
     * 查询全部
     * @return
     */
    @Select("select * from stu_student")
    List<Student> findAll();

    /**
     * 添加
     * @param stu
     */
    @Insert("insert into stu_student (name,age,addr) values(#{name},#{age},#{addr})")
    void saveStu(Student stu);

    /**
     * 修改
     * @param stu
     */
    @Update("update stu_student set name=#{name},age=#{age},addr=#{addr} where id=#{id}")
    void updateStu(Student stu);

    /**
     * 删除
     * @param stuid
     */
    @Delete("delete from stu_student where id=#{stuid}")
    void deleteStu(Integer stuid);

    /**
     * 查询一条
     * @param stuid
     * @return
     */
    @Select("select * from stu_student where id=#{stuid}")
    Student selectById(Integer stuid);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    @Select("select * from stu_student where name like #{name}")
    List<Student> fuzzySelect(String name);

    /**
     * 查询数据表中的总条数
     * @return
     */
    @Select("select count(*) from stu_student")
    int findTotal();
}
