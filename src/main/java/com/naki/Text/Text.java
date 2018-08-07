package com.naki.Text;

import com.naki.Chapter.Chapter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "text", schema ="public")
public class Text implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "text", length=10000)
    private String text;

    @Column(name = "exemple", length=10000)
    private String exemple;

    @ManyToOne
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
    public Text() {};


    public Text(long id, String text, String exemple) {
        this.id = id;
        this.text = text;
        this.exemple = exemple;
    }
}
