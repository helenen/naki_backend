package com.naki.Level;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "level", schema ="public")
public class Level implements Serializable{

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

    public Level(String name) {
        this.name = name;

    }
}
