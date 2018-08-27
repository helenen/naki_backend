package com.naki.Chapter;

import com.naki.Exercise.Exercise;
import com.naki.Lesson.Lesson;
import com.naki.Text.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ChapterController {

    @Autowired
    private ChapterService chapterService;


    @GetMapping("/chapters")
    public List<Chapter> getAllChapters() {
        return chapterService.listAllChapters();
    }

    @GetMapping("/chapter/{id}/texts")
    public List<Text> getChapterAndText(@PathVariable Long id) {return chapterService.findById(id).getText();}

    @GetMapping("/chapter/{id}/exercises")
    public List<Exercise> getExerciseByChapter(@PathVariable Long id) {return chapterService.findById(id).getExercise();}
}
