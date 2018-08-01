package com.naki.Theme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService{

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public List<Theme> listAllThemes() {
        System.out.println("Before finding all themes");
        return themeRepository.findAll();

    }
}
