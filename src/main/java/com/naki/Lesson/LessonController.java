package com.naki.Lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class LessonController {

        @Autowired
        private LessonService lessonService;


        @GetMapping("/lessons")
        public List<Lesson> getAllLessons() {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + lessonService.listAllLessons().get(0).getName());
            return lessonService.listAllLessons();
        }

    }
