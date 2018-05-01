package com.naki.Lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    @Autowired(required=true)
    private LessonRepository lessonRepository;

    public List<Lesson> listAllPersons() {
        System.out.println("Before finding all persons");
        return lessonRepository.findAll();
    }
}
