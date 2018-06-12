package com.naki.Cours;

import java.io.Serializable;
import java.util.List;

public class CoursDTO implements Serializable {

    private Long id;

    private String name;

    private String SubTitle;

    private String title;

    private String text;

    private String exemple;

    public Long getId(){ return id;}

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
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
}
