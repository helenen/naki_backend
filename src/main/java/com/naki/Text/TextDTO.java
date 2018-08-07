package com.naki.Text;

import com.naki.Chapter.Chapter;

import java.io.Serializable;

public class TextDTO implements Serializable {

    private long id;

    private String text;

    private String exemple;

    private Chapter chapter;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Chapter getChapter() {
        return chapter;
    }
}
