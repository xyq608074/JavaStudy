package com.exam.service.impl;

import com.exam.dao.ClazzDao;
import com.exam.domain.Clazz;
import com.exam.service.ClazzService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class ClazzServiceImpl implements ClazzService {

    private ClazzDao clazzDao;

    public void setClazzDao(ClazzDao clazzDao) {
        this.clazzDao = clazzDao;
    }

    @Override
    public List<Clazz> classList(String clazz) {
        return clazzDao.classList(clazz);
    }
}
