package com.exam.service;

import com.exam.domain.Questions;

import java.util.List;

public interface QuestionsService {

    List<Questions> select(String questions);

    Integer add(Questions questions);

    void delete(Questions questions);

    Questions findid(Questions questions);

    void update(Questions questions);
}
