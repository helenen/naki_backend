package com.naki.Dialogue;

import com.naki.Exercise.Exercise;
import com.naki.Theme.Theme;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dialogue", schema ="public")
public class Dialogue implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

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

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Exercise exercise;

    public Dialogue(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
