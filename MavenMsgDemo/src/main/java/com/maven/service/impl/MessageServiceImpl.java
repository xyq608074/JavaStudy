package com.maven.service.impl;

import com.maven.dao.MessageDao;
import com.maven.domain.Msg;
import com.maven.service.MessageService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class MessageServiceImpl implements MessageService {

    private MessageDao messageDao;
    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    //保存
    @Override
    public void save(Msg msg) {
        System.out.println("MessageServiceimpl save");
        messageDao.save(msg);
    }

    //查询所有
    @Override
    public List<Msg> findAll() {
        System.out.println("MessageServiceimpl findAll");
        return messageDao.findAll();
    }

    //删除
    @Override
    public void delete(Msg msg) {
        System.out.println("MessageServiceimpl delete");
        messageDao.delete(msg);
    }

    //查询一条
    @Override
    public List<Msg> find(Msg msg) {
        System.out.println("MessageServiceimpl find");
        List<Msg> msglist=messageDao.find(msg);
        return msglist;
    }

    //修改
    @Override
    public void update(Msg msg) {
        System.out.println("MessageServiceimpl update");
        messageDao.update(msg);
    }
}
