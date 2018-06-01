package com.naki.Lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LessonController {

        @Autowired
        private LessonService lessonService;


        @GetMapping("/lessons")
        public List<Lesson> getAllLessons() {
            return lessonService.listAllLessons();
        }

    }
