package com.message.service;

import com.message.domain.Message;

import java.util.List;

public interface MessageService {
    List<Message> messageFind();

    void messageadd(Message message);

    void del(int del);
}
