package com.naki.Number;

import com.naki.Category.Category;
import com.naki.Exercise.Exercise;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "number", schema ="public")
public class Number implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;


    @Column(name = "romaji")
    private String romaji;

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
    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Category category;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Exercise exercise;

    public Number(long id, String name, String romaji) {
        this.id = id;
        this.name = name;
        this.romaji = romaji;
    }
}
