package com.naki.Lesson;


import java.io.Serializable;

public class LessonDTO implements Serializable {
    
    private Long id;

    private String name;

    private Long lesson_order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson_order() {
        return name;
    }

    public String setLesson_order() {
        return name;
    }
}