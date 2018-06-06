package com.naki.SubTheme;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class SubThemeController {

    @Autowired
    private SubThemeService subThemeService;


    @GetMapping("/subThemes")
    public List<SubTheme> getAllSubThemes() {
        return subThemeService.listAllSubThemes();
    }
}
