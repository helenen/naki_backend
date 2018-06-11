package com.naki.Verb;

import com.naki.Theme.Theme;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

public class VerbDTO implements Serializable {

    private long id;

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

    @OneToMany
    private List<Theme> theme;

    public void setName(String name) {
        this.name = name;
    }
}
