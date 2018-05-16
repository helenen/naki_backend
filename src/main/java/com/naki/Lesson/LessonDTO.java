package com.naki.Lesson;


import java.io.Serializable;

public class LessonDTO implements Serializable {
    
    private Long id;

    private String name;

    private Long lesson_order;

    public Long getId(){
        return  id;
    }

    public Long getLessonOrder(){
        return lesson_order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setLesson_order() {
        return name;
    }
}