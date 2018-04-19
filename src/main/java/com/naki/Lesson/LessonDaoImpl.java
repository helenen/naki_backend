package com.naki.Lesson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LessonDaoImpl implements LessonDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addLesson(Lesson p) {

    }

    @Override
    public void updateLesson(Lesson p) {

    }

    @Override
    public List<Lesson> listLesson() {
        Session session = this.sessionFactory.getCurrentSession();

        return session.createQuery("from Lesson").list();
    }

    @Override
    public Lesson getId(int id) {
        return null;
    }

    @Override
    public void removeLesson(int id) {

    }
}
