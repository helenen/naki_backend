package com.naki.Level;

import com.naki.Lesson.Lesson;
import com.naki.Theme.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class LevelController {

    @Autowired
    private LevelService levelService;


    @GetMapping("/levels")
    public List<Level> getAllLevels() {
        return levelService.listAllLevels();
    }

    @GetMapping("/levels/{id}")
    public List<Lesson> getLessonById(@PathVariable Long id){
        return levelService.findById(id).getLessons();
    }

    @GetMapping("/level/{id}/lesson")
    public List<Lesson> getLessonsByLevel(@PathVariable Long id){ return levelService.findById(id).getLessons();}
}
