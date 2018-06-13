package com.naki.Chapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    @Autowired(required=true)
    private ChapterRepository chapterRepository;

    public List<Chapter> listAllChapters() {
        System.out.println("Before finding all chapter");
        return chapterRepository.findAll();
    }
}
