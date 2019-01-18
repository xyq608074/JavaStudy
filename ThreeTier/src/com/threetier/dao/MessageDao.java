package com.threetier.dao;

import com.threetier.domain.Message;
import com.threetier.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class MessageDao {

    public List<Message> findAllMessage() throws SQLException {
        //操作数据库
        QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from msg order by id desc";
        List<Message> mdaolist = qr.query(sql, new BeanListHandler<Message>(Message.class));
        return mdaolist;
    }

    public int MsgDel(int id) throws SQLException {
        QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="delete from msg where id=?";
        return qr.update(sql,id);
    }

    public void MsgAdd(String name,String message,String msgtime) throws SQLException {
        QueryRunner qr =new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into msg value(null,?,?,?)";
        qr.update(sql,name,message,msgtime);
    }

    public List<Message> findMessage(int id) throws SQLException {
        QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from msg where id=?";
        return qr.query(sql,new BeanListHandler<Message>(Message.class),id);
    }

    public void msgUpdate(int id, String name, String message) throws SQLException {
        QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="update msg set name=?,message=? where id=?";
        qr.update(sql,name,message,id);
    }
}
