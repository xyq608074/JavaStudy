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

    @Override
    public void save(Msg msg) {
        System.out.println("MessageService save");
        messageDao.save(msg);
    }

    @Override
    public List<Msg> findAll() {
        System.out.println("MessageService findAll");
        return messageDao.findAll();
    }
}
