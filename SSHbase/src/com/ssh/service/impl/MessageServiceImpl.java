package com.ssh.service.impl;

import com.ssh.dao.MessageDao;
import com.ssh.domain.Message;
import com.ssh.service.MessageService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MessageServiceImpl implements MessageService {

    //注入dao
    private MessageDao messageDao;

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    @Override
    public void save(Message msg) {
        System.out.println("MessageServiceImpl 执行save");
        messageDao.save(msg);
    }
}
