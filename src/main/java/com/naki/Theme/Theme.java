package com.naki.Theme;

import com.naki.Cours.Cours;
import com.naki.Level.Level;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "theme", schema ="public")
public class Theme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    private Cours cours;

    @ManyToMany
    @JoinTable(name = "Level_Theme", joinColumns = @JoinColumn(name = "level_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "theme_id", referencedColumnName = "id"))
    private List<Level> level = new ArrayList<>();

    public Theme(String name, String description) {
        this.name = name;
        this.description= description;

    }

}
