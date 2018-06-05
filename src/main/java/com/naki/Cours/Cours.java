package com.naki.Cours;


import com.naki.Asset.Asset;
import com.naki.Exercise.Exercise;
import com.naki.SubTheme.SubTheme;
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

    @OneToMany
    private List<Theme> theme = new ArrayList<>();

    @OneToMany
    private List<SubTheme> subTheme = new ArrayList<>();


    @ManyToOne
    private Exercise exercise = new Exercise();

    @ManyToMany
    @JoinTable(name = "Cours_Asset", joinColumns = @JoinColumn(name = "cours_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "id"))
    private List<Asset> asset = new ArrayList<>();

    public Cours(){};

    public Cours (long id, String name){
        this.id = id;
        this.name = name;
    }
}

