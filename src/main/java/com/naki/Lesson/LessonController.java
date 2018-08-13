package com.naki.Lesson;

import com.naki.Chapter.Chapter;
import com.naki.Chapter.ChapterDTO;
import com.naki.Level.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;


    @GetMapping("/lessons")
    public List<Lesson> getAllLessons() {
        return lessonService.listAllLessons();
    }

    @GetMapping("/lesson/{id}/chapters")
    public List<Chapter> getChapter(@PathVariable Long id){ return lessonService.findById(id).getChapters(); }



}
