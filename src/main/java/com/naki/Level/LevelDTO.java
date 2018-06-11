package com.naki.Level;

import java.io.Serializable;

public class LevelDTO implements Serializable {

    private long id;

    private long name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }
}
