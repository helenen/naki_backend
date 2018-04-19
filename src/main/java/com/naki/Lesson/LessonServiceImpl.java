package com.naki.Lesson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    private LessonDao lessonDao;

    //public void setLessonDao(LessonDao lessonDAO) {
       // this.lessonDao = lessonDAO;
    //}

    @Override
    @Transactional
    public void addLesson(Lesson p) {
        this.lessonDao.addLesson(p);
    }

    @Override
    @Transactional
    public void updateLesson(Lesson p) {
        this.lessonDao.updateLesson(p);
    }

    @Override
    @Transactional
    public List<Lesson> listLesson() {
        return this.lessonDao.listLesson();
    }

    @Override
    @Transactional
    public Lesson getId(int id) {
        return this.lessonDao.getId(id);
    }

    @Override
    @Transactional
    public void removeLesson(int id) {
        this.lessonDao.removeLesson(id);
    }
}
