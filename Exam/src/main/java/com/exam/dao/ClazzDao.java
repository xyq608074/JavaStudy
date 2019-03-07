package com.exam.dao;

import com.exam.domain.Clazz;

import java.util.List;

public interface ClazzDao {
    List<Clazz> classList(String clazz);
}
