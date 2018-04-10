package com.naki.Lesson;

import javax.transaction.Transactional;
import java.util.List;

public interface LessonService {

    public void addLesson(Lesson p);
    public void updateLesson(Lesson p);
    public List<Lesson> listLesson();
    public Lesson getLessonById(int id);
    public void removeLesson(int id);

    @Transactional
    void addPerson(Lesson p);
}
