package com.exam.service.impl;

import com.exam.dao.ExamDao;
import com.exam.service.ExamService;

public class ExamServiceImpl implements ExamService {

    private ExamDao examDao;
    public void setExamDao(ExamDao examDao) {
        this.examDao = examDao;
    }

    @Override
    public void test() {
        System.out.println("service");
        examDao.test();
    }
}
