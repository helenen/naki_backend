package com.naki.Lesson;

import com.naki.Chapter.Chapter;
import com.naki.Level.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LessonService {

    List<Lesson> listAllLessons();

    Lesson findById(Long id);


}