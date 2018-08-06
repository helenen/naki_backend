package com.naki.Lesson;

import com.naki.Chapter.Chapter;
import com.naki.Level.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl  implements LessonService{

    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public List<Lesson> listAllLessons() {
        System.out.println("Before finding all lessons");
        return lessonRepository.findAll();

    }

    @Override
    public Lesson findById(Long id){
        return lessonRepository.findOne(id);
    }


}
