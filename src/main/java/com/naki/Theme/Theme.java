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

    public List<Level> getLevel() {
        return level;
    }

    public void setLevel(List<Level> level) {
        this.level = level;
    }

    @OneToMany
    private List<Level> level;

    @ManyToOne
    private Lesson lesson;

    @ManyToOne
    private Vocabulary vocabulary;

    @ManyToOne
    private Number nomber;

    @ManyToOne
    private Verb verb;

    @ManyToOne
    private Dialogue dialogue;

    public Theme(String name, String description) {
        this.name = name;
        this.description= description;

    }

}
