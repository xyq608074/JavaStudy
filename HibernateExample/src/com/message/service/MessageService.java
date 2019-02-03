package com.message.service;

import com.message.domain.Message;

import java.util.List;

public interface MessageService {
    List<Message> messageSelect();

    void messageadd(Message message);

    void del(int del);

    List messageFind(int updateid);

    void update(Message message);
}
