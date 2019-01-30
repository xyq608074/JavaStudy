package com.message.dao;

import com.message.domain.Message;

import java.util.List;

public interface MessageDao {
    List<Message> find();

    void add(Message message);

    void del(int del);
}
