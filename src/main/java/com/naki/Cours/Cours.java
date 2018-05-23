package com.naki.Cours;


import com.naki.Asset.Asset;
import com.naki.Exercice.Exercice;
import com.naki.Lesson.Lesson;
import com.naki.Level.Level;
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

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}

    @ManyToOne
    private Lesson lesson = new Lesson();

    @ManyToMany
    private List<Theme> theme = new ArrayList<>();

    @ManyToOne
    private Exercice exercice = new Exercice();

    @ManyToMany
    @JoinTable(name = "Cours_Asset", joinColumns = @JoinColumn(name = "cours_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "id"))
    private List<Asset> asset = new ArrayList<>();

    public Cours(){};

    public Cours (long id, String name){
        this.id = id;
        this.name = name;
    }
}

