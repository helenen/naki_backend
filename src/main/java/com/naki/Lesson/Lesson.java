package com.naki.Lesson;


import com.naki.Asset.Asset;
import com.naki.Cours.Cours;
import com.naki.Level.Level;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lesson", schema ="public")
public class Lesson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "order")
    private int order;


    @ManyToMany
    private List<Asset> asset = new ArrayList<>();

    @ManyToOne
    private Cours cours;

    @ManyToMany
    private List<Level> level = new ArrayList<>();

    public Lesson(long id, int order, String name, List<Asset> asset) {

        this.id = id;
        this.order = order;
        this.name = name;

    }
}
