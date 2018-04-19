package com.naki.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class LessonController {

    @Autowired
    private LessonServiceImpl lessonServiceImpl;

     //@Autowired(required=true)
     //@Qualifier(value="lessonService")
     //public void setLessonService(LessonServiceImpl ps){
     // this.lessonServiceImpl = ps;
   //}

    @RequestMapping(value = "/lesson", method = RequestMethod.GET)
    public List<Lesson> listLesson() {
        return this.lessonServiceImpl.listLesson();

    }

    //@RequestMapping(value= "/lesson/add", method = RequestMethod.POST)
    //public String addLesson(@ModelAttribute("lesson") Lesson p){

        //if(p.getId() == 0){
            //new lesson, add it
            //this.lessonService.addLesson(p);
        //}else{
            //existing lesson, call update
            //this.lessonService.updateLesson(p);
        //}

       // return "redirect:/lesson";

    //}
}
