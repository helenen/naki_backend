package com.naki.Chapter;

import com.naki.Exercise.Exercise;
import com.naki.Lesson.Lesson;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "chapter", schema ="public")
public class Chapter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "text", length=10000)
    private String text;

    @Column(name = "exemple", length=10000)
    private String exemple;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getExemple() {
        return exemple;
    }

    public void setExemple(String exemple) {
        this.exemple = exemple;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @ManyToOne
    private Exercise exercise ;

    @OneToOne(targetEntity = Lesson.class)
    private Lesson lesson;

    public Chapter() {};


    public Chapter(long id, String title, String text, String exemple) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.exemple = exemple;
    }
}
