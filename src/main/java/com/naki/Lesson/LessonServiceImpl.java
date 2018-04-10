package com.naki.Lesson;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public abstract class LessonServiceImpl implements LessonService{

    private LessonDao lessonDao;

    public void setLessonDAO(LessonDao lessonDAO) {
        this.lessonDao = lessonDAO;
    }

    @Override
    @Transactional
    public void addPerson(Lesson p) {
        this.lessonDao.addPerson(p);
    }
}
