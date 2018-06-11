package com.naki.Nomber;

import java.io.Serializable;

public class NomberDTO implements Serializable {

    private long id;

    private String name;

    private String romaji;

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

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
}
