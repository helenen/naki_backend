package com.naki.Lesson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


import org.apache.log4j.Logger;




@Repository
public  abstract class LessonDaoImpl implements LessonDao {

    private SessionFactory sessionFactory;
    private static final Logger logger = Logger.getLogger("com.naki.Lesson.LessonDaoImpl.class");

    public  LessonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPerson(Lesson p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Person saved successfully, Person Details="+p);

    }
}
