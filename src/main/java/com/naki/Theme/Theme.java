package com.naki.Theme;

import com.naki.Vocabulary.Vocabulary;
import com.naki.Cours.Cours;
import com.naki.Dialogue.Dialogue;
import com.naki.Level.Level;
import com.naki.Nomber.Nomber;
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

    @OneToMany
    private List<Level> level;

    @ManyToOne
    private Cours cours;

    @ManyToOne
    private Vocabulary vocabulary;

    @ManyToOne
    private Nomber nomber;

    @ManyToOne
    private Verb verb;

    @ManyToOne
    private Dialogue dialogue;

    public Theme(String name, String description) {
        this.name = name;
        this.description= description;

    }

}
