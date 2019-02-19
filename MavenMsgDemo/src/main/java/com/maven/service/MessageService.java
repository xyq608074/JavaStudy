package com.maven.service;

import com.maven.domain.Msg;

import java.util.List;

public interface MessageService {

    void save(Msg msg);

    List<Msg> findAll();

    void delete(Msg msg);

    List<Msg> find(Msg msg);

    void update(Msg msg);
}
