package com.naki.Lesson;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.naki.Chapter.Chapter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "lesson", schema ="public")
public class Lesson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name")
    private String name;
    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @OneToMany(targetEntity = Chapter.class, mappedBy = "lesson")
    @JsonIgnore
    private List<Chapter> chapters;

    public Long getId(){ return id;}

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}

    public Lesson(){};

    //chapter manytoone
    public Lesson (long id, String name){
        this.id = id;
        this.name = name;
    }
}

