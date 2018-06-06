package com.naki.SubTheme;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubThemeService {

    @Autowired(required=true)
    private SubThemeRepository subThemeRepository;

    public List<SubTheme> listAllSubThemes() {
        System.out.println("Before finding all subThemes");
        return subThemeRepository.findAll();
    }
}
