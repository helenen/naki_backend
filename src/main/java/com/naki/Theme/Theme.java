package com.naki.Theme;

import com.naki.Level.Level;
import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name = "theme", schema ="public")
public class Theme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    //@OneToOne(cascade=CascadeType.ALL)
    //@JoinTable(name="cours", joinColumns={@JoinColumn(name="theme_id", referencedColumnName="id")},
            //inverseJoinColumns={@JoinColumn(name="level_id", referencedColumnName="id")})


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

    public Theme(String name, String description) {
        this.name = name;
        this.description= description;

    }

}
