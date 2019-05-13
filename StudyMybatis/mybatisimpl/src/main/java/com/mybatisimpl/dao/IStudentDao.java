package com.mybatisimpl.dao;

import com.mybatisimpl.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IStudentDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from stu_student")
    List<Student> findAll();

    /**
     * 保存
     * @param stu
     */
    @Insert("insert into stu_student(name,age,addr)value(#{name},#{age},#{addr})")
    void saveStu(Student stu);

    /**
     * 修改
     * @param stu
     */
    @Update("update stu_student set name=#{name},age=#{age},addr=#{addr} where id=#{id}")
    void updateStu(Student stu);

    /**
     * 删除
     * @param id
     */
    @Delete("delete from stu_student where id=#{id}")
    void deleteStu(Integer id);
}
