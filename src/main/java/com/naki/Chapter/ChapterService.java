package com.naki.Chapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChapterService {

    List<Chapter> listAllChapters();
    Chapter  findById(Long id);
}
