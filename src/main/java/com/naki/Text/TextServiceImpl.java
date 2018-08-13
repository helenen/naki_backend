package com.naki.Text;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextServiceImpl implements TextService{

    @Autowired
    private TextRepository textRepository;

    @Override
    public List<Text> listAllTexts() {
        System.out.println("Before finding all texts");
        return textRepository.findAll();

    }

    @Override
    public Text findById(Long id){
        return textRepository.findOne(id);
    }
}
