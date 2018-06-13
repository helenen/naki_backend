package com.naki.Chapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ChapterController {

    @Autowired
    private ChapterService chapterService;


    @GetMapping("/chapter")
    public List<Chapter> getAllChapters() {
        return chapterService.listAllChapters();
    }
}
