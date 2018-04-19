package com.naki.Lesson;

import java.util.List;

public interface LessonService {

    public void addLesson(Lesson p);
    public void updateLesson(Lesson p);
    public List<Lesson> listLesson();
    public Lesson getId(int id);
    public void removeLesson(int id);

    //@Transactional
    //void addLesson(Lesson p);
}
