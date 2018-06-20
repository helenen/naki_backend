package com.naki.Lesson;


import com.naki.Asset.Asset;
import com.naki.Chapter.Chapter;
import com.naki.Exercise.Exercise;
import com.naki.Theme.Theme;

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

    public Long getId(){ return id;}

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}

    public Lesson(){};

    @OneToMany(targetEntity = Chapter.class)
    private List<Chapter> chapter;

    public Lesson (long id, String name){
        this.id = id;
        this.name = name;
    }
}

