package com.naki.Level;

import com.naki.Cours.Cours;
import com.naki.Lesson.Lesson;
import com.naki.SubTheme.SubTheme;
import com.naki.Theme.Theme;
import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


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


    @ManyToMany
    @JoinTable(name = "Level_Theme", joinColumns = @JoinColumn(name = "level_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "theme_id", referencedColumnName = "id"))
    private List<Theme> theme;

    public Level(String name) {
        this.name = name;

    }



}
