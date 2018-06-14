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

    public Long getId(){ return id;}

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}

    public Cours(){};

    public Cours (long id, String name){
        this.id = id;
        this.name = name;
    }
}

