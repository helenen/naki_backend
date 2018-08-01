package com.naki.Theme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ThemeController {

    @Autowired
    private ThemeService themeService;


    @GetMapping("/themes")
    public List<Theme> getAllThemes() {
        return themeService.listAllThemes();
    }
}

