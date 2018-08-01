package com.naki.Lesson;

import com.naki.Chapter.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LessonService {

    List<Lesson> listAllLessons();

    Lesson findById(Long id);
}