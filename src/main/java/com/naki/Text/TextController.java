package com.naki.Text;

import com.naki.Chapter.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class TextController {

    @Autowired
    private TextService textService;


    @GetMapping("/texts")
    public List<Text> getAllTexts() {
        return textService.listAllTexts();
    }

}
