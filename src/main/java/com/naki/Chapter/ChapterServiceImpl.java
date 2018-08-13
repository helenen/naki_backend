package com.naki.Chapter;

import com.naki.Text.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService{

    @Autowired(required=true)
    private ChapterRepository chapterRepository;

    @Override
    public List<Chapter> listAllChapters() {
        System.out.println("Before finding all chapters");
        return chapterRepository.findAll();
    }

    @Override
    public  Chapter findById(Long id){
        return chapterRepository.findOne(id);
    }
}
