package com.naki.Level;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.naki.Lesson.Lesson;
import com.naki.Theme.Theme;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "level", schema ="public")
public class Level implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = Lesson.class, mappedBy = "level",cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Lesson> lessons;

    public List<Lesson> getLessons() {
        return lessons;
    }

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



    public Level(){};

    public Level(String name) {
        this.name = name;

    }

}
