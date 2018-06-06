package com.naki.Lesson;


import com.naki.Asset.Asset;
import com.naki.Cours.Cours;
import com.naki.Level.Level;
import com.naki.SubTheme.SubTheme;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lesson", schema ="public")
public class Lesson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lesson_order")
    private int lesson_order;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @ManyToMany
    private List<Asset> asset = new ArrayList<>();

    @ManyToMany
    private List<Level> level = new ArrayList<>();

    @ManyToOne
    private Cours cours;

    @OneToMany
    private List<SubTheme> subTheme = new ArrayList<>();

    public Lesson(){};

    public Lesson(long id, int lesson_order, String name) {

        this.id = id;
        this.lesson_order = lesson_order;
        this.name = name;

    }

}
