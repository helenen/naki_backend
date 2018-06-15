package com.naki.Verb;

import com.naki.Category.Category;
import com.naki.Exercise.Exercise;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "verb", schema ="public")
public class Verb implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @ManyToOne
    private Category category;

    @ManyToOne
    private Exercise exercise;


    public Verb(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
