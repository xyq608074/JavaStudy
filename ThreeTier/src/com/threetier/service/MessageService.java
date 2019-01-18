package com.threetier.service;

import com.threetier.dao.MessageDao;
import com.threetier.domain.Message;

import java.sql.SQLException;
import java.util.List;

public class MessageService {
    public List<Message> findAllMessage() throws SQLException {

        //传递请求dao层
        MessageDao dao=new MessageDao();
        List<Message> mservicelist=dao.findAllMessage();
        return mservicelist;
    }

    public void MessageDel(int id) throws SQLException {
        MessageDao dao =new MessageDao();
        dao.MsgDel(id);
    }

    public void MessageAdd(String name,String message,String msgtime) throws SQLException {
        MessageDao messageDao = new MessageDao();
        messageDao.MsgAdd(name,message,msgtime);
    }

    public List<Message> findMessage(int id) throws SQLException {
        MessageDao messageDao = new MessageDao();
        return messageDao.findMessage(id);
    }

    public void MessageUpdate(int id,String name,String message) throws SQLException {
        MessageDao messageDao = new MessageDao();
        messageDao.msgUpdate(id,name,message);
    }
}
