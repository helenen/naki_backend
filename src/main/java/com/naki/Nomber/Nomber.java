package com.naki.Nomber;

import com.naki.Category.Category;
import com.naki.Exercise.Exercise;
import com.naki.Theme.Theme;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "nomber", schema ="public")
public class Nomber  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @OneToMany
    private List<Category> category;

    @ManyToOne
    private Exercise exercise;

    public Nomber(long id, String name,String romaji) {
        this.id = id;
        this.name = name;
        this.romaji = romaji;
    }
}
