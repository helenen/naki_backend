package com.naki.Level;

import com.naki.Theme.Theme;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "level", schema ="public")
public class Level implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Level(String name) {
        this.name = name;

    }



}
