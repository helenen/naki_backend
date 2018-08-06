package com.naki.Lesson;

import com.naki.Chapter.Chapter;
import com.naki.Level.Level;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {

    List<Lesson> findAll();
    Lesson findOne(Long id);

}
