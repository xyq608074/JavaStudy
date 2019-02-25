package com.exam.service;

import com.exam.domain.Clazz;
import com.exam.domain.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher login(Teacher teacher);

    List<Clazz> classlist(String thclass);

}
