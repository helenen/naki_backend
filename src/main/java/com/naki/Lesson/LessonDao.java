package com.naki.Lesson;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public  interface LessonDao {

    public void addLesson(Lesson p);
    public void updateLesson(Lesson p);
    public List<Lesson> listLesson();
    public Lesson getId(int id);
    public void removeLesson(int id);

    //void addPerson(Lesson p);
}
