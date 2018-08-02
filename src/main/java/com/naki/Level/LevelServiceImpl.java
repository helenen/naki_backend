package com.naki.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {

    @Autowired
    private LevelRepository levelRepository;

    @Override
    public List<Level> listAllLevels() {
        System.out.println("Before finding all levels");
        return levelRepository.findAll();

    }

    @Override
    public Level findById(Long id){
        return levelRepository.findOne(id);
    }

}
