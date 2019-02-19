package com.maven.service;

import com.maven.domain.Msg;

import java.util.List;

public interface MessageService {

    void save(Msg msg);

    List<Msg> findAll();
}
