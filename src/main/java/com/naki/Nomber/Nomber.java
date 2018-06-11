package com.naki.Nomber;

import com.naki.Category.Category;
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

    @OneToMany
    private List<Category> categories;

    public Nomber(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
