package com.maven.dao;

import com.maven.domain.Msg;

import java.util.List;

public interface MessageDao {
    void save(Msg msg);

    List<Msg> findAll();
}
