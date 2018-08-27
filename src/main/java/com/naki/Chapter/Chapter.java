package com.naki.Chapter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.naki.Exercise.Exercise;
import com.naki.Lesson.Lesson;
import com.naki.Text.Text;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "chapter", schema ="public")
public class Chapter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;


    @ManyToOne(cascade = CascadeType.REMOVE)
    private Lesson lesson;

    @OneToMany(targetEntity = Text.class, mappedBy = "chapter",cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Text> text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Text> getText(){ return  text;}

    @OneToMany(targetEntity = Exercise.class, mappedBy = "chapter",cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Exercise> exercise;

    public List<Exercise> getExercise(){ return exercise;}



    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Chapter() {};


    public Chapter(long id, String title) {
        this.id = id;
        this.title = title;
    }


}
