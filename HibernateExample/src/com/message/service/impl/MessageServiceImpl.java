package com.message.service.impl;


import com.message.dao.MessageDao;
import com.message.dao.impl.MessageDaoImpl;
import com.message.domain.Message;
import com.message.service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Override
    public List<Message> messageFind() {

        MessageDao messageDao = new MessageDaoImpl();
        List<Message> messages = messageDao.find();
//
        return messages;
    }

    @Override
    public void messageadd(Message message) {
        MessageDao messageDao = new MessageDaoImpl();
        messageDao.add(message);

    }

    @Override
    public void del(int del) {
        MessageDao messageDao = new MessageDaoImpl();
        messageDao.del(del);
    }


}
