package com.naki.Vocabulary;


import com.naki.Category.Category;
import com.naki.Exercise.Exercise;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "vocabulary", schema ="public")
public class Vocabulary implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "romaji")
    private String romaji;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Category category;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Exercise exercise;

    public Vocabulary(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
