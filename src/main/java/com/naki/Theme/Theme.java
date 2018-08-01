package com.naki.Theme;

import com.naki.Lesson.Lesson;
import com.naki.Vocabulary.Vocabulary;
import com.naki.Dialogue.Dialogue;
import com.naki.Level.Level;
import com.naki.Number.Number;
import com.naki.Verb.Verb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "theme", schema ="public")
public class Theme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public List<Level> getLevel() {
        return level;
    }

    public void setLevel(List<Level> level) {
        this.level = level;
    }

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Level> level;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Lesson lesson;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Vocabulary vocabulary;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Number nomber;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Verb verb;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Dialogue dialogue;

    public Theme(){};

    public Theme(String name, String description) {
        this.name = name;
        this.description= description;

    }

}
