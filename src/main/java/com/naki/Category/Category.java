package com.naki.Category;


import com.naki.SubTheme.SubTheme;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category", schema ="public")

public class Category  implements Serializable {

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


    public Category(long id, String name) {
        this.id = id;
        this.name = name;
    }

}


