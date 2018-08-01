package com.naki.Lesson;

import com.naki.Chapter.Chapter;

import java.io.Serializable;
import java.util.List;

public class LessonDTO implements Serializable {

    private Long id;

    private String name;

    public Long getId(){ return id;}

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}

}
