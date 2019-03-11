package com.exam.service.impl;

import com.exam.dao.QuestionDao;
import com.exam.domain.Questions;
import com.exam.service.QuestionsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class QuestionServiceImpl implements QuestionsService {

    private QuestionDao questionDao;

    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }


    @Override
    public List<Questions> select(String questions) {
        return questionDao.select(questions);
    }

    @Override
    public Integer add(Questions questions) {
        questions.setQsTitle(questions.getQsTitle());
        questions.setQsA(questions.getQsA());
        questions.setQsB(questions.getQsB());
        questions.setQsC(questions.getQsC());
        questions.setQsD(questions.getQsD());
        questions.setQsAnswer(questions.getQsAnswer());
        questions.setQsCourse(questions.getQsCourse());

        Integer add = questionDao.add(questions);
        return add;
    }

    //删除
    @Override
    public void delete(Questions questions) {
        questions.setQsId(questions.getQsId());
        questionDao.delete(questions);
    }

    //查询一条
    @Override
    public Questions findid(Questions questions) {
        questions.setQsId(questions.getQsId());
        return questionDao.findid(questions);
    }

    //修改
    @Override
    public void update(Questions questions) {
        questionDao.update(questions);
    }
}
