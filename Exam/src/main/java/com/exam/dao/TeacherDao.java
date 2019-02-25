package com.exam.dao;

import com.exam.domain.Clazz;
import com.exam.domain.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher login(Teacher teacher);

    List<Clazz> classlist(String thclass);
}
