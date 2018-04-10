package com.naki.Lesson;

import java.util.List;


public  interface LessonDao {

    public void addLesson(Lesson p);
    public void updateLesson(Lesson p);
    public List<Lesson> listLesson();
    public Lesson getLessonById(int id);
    public void removeLesson(int id);


    void addPerson(Lesson p);
}
