package com.exam.dao;

import com.exam.domain.Questions;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface QuestionDao {
    List<Questions> select(String questions);

    Integer add(Questions questions);

    void delete(Questions questions);

    Questions findid(Questions questions);

    void update(Questions questions);

    Integer randselectcount(DetachedCriteria detachedCriteria);

    List<Questions> randselect(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize);
}
