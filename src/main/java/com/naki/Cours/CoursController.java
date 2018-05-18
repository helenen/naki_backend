package com.naki.Cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursController {

    @Autowired
    private CoursService coursService;


    @GetMapping("/cours")
    public List<Cours> getAllCours() {
        return coursService.listAllCours();
    }
}
