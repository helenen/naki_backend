package com.naki.Cours;


import com.naki.Asset.Asset;
import com.naki.Exercise.Exercise;
import com.naki.Theme.Theme;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cours", schema ="public")
public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "SubTitle")
    private String subTitle;

    @Column(name = "title")
    private String title;

    @Column(name = "text", length=1000)
    private String text;

    @Column(name = "exemple")
    private String exemple;

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}

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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @ManyToOne
    private Exercise exercise = new Exercise();

    public Cours(){};

    public Cours (long id, String name,String subTitle, String title, String text, String exemple ){
        this.id = id;
        this.name = name;
        this.subTitle= subTitle;
        this.title= title;
        this.text= text;
        this.exemple= exemple;
    }
}

