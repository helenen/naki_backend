package com.naki.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class LessonController {

    private LessonService lessonService;

    @Autowired(required=true)
    @Qualifier(value="personService")
    public void setLessonService(LessonService ps){
        this.lessonService = ps;
    }

    @RequestMapping(value = "/lessons", method = RequestMethod.GET)
    public String listLesson(Model model) {
        model.addAttribute("person", new LessonDao() {
            @Override
            public void addLesson(Lesson p) {

            }

            @Override
            public void updateLesson(Lesson p) {

            }

            @Override
            public List<Lesson> listLesson() {
                return null;
            }

            @Override
            public Lesson getLessonById(int id) {
                return null;
            }

            @Override
            public void removeLesson(int id) {

            }

            @Override
            public void addPerson(Lesson p) {

            }
        });
        model.addAttribute("listLesson", this.lessonService.listLesson());
        return "lesson";
    }
}
