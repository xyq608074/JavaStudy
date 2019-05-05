package com.exam.service;

import com.exam.domain.PageBean;
import com.exam.domain.Questions;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface QuestionsService {

    List<Questions> select(String questions);

    Integer add(Questions questions);

    void delete(Questions questions);

    Questions findid(Questions questions);

    void update(Questions questions);

    PageBean<Questions> randselect(DetachedCriteria detachedCriteria, Integer currentPage, Integer pageSize);

    int rightorwrong(Questions questions);
}
