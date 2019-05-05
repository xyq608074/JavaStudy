package com.exam.service.impl;

import com.exam.dao.QuestionsDao;
import com.exam.domain.PageBean;
import com.exam.domain.Questions;
import com.exam.service.QuestionsService;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class QuestionsServiceImpl implements QuestionsService {

    private QuestionsDao questionsDao;

    public void setQuestionsDao(QuestionsDao questionDao) {
        this.questionsDao = questionDao;
    }


    @Override
    public List<Questions> select(String questions) {
        return questionsDao.select(questions);
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

        Integer add = questionsDao.add(questions);
        return add;
    }

    //删除
    @Override
    public void delete(Questions questions) {
        questions.setQsId(questions.getQsId());
        questionsDao.delete(questions);
    }

    //查询一条
    @Override
    public Questions findid(Questions questions) {
        questions.setQsId(questions.getQsId());
        return questionsDao.findid(questions);
    }

    //修改
    @Override
    public void update(Questions questions) {
        questionsDao.update(questions);
    }

    @Override
    public PageBean<Questions> randselect(DetachedCriteria detachedCriteria, Integer currentPage, Integer pageSize) {
        PageBean<Questions> pageBean= new PageBean<Questions>();

        //封装当前的页数
        pageBean.setCurrentPage(currentPage);
        //封装每页记录数
        pageBean.setPageSize(pageSize);
        //封装总记录数
        Integer rscount=questionsDao.randselectcount(detachedCriteria);
        pageBean.setTotal(rscount);
        //封装总页数
        pageBean.setTotalPage((int) Math.ceil(rscount/pageSize));
        //封装每页显示的数据集合
        Integer begin=(currentPage-1)*pageSize;


        List<Questions> randselect = questionsDao.randselect(detachedCriteria, begin, pageSize);
        pageBean.setList(randselect);

        return pageBean;
    }

    @Override
    public int rightorwrong(Questions questions) {
        return questionsDao.righttowrong(questions);
    }
}
