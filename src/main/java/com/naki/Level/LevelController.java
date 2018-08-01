package com.naki.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class LevelController {

    @Autowired
    private LevelService levelService;


    @GetMapping("/levels")
    public List<Level> getAllLessons() {
        return levelService.listAllLevels();
    }
}
