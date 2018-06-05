package com.naki.SubTheme;

import com.naki.Cours.Cours;
import com.naki.Exercise.Exercise;
import com.naki.Theme.Theme;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="subtheme", schema="public")
public class SubTheme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @ManyToOne
    private Cours cours;

    @ManyToOne
    private Exercise exercise;

    @OneToMany
    private List<Theme> theme = new ArrayList<>();

    public SubTheme(String name, String description, String type){
        this.name = name;
        this.description= description;
        this.type = type;
    };
}
