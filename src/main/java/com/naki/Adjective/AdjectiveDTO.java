package com.naki.Adjective;

import java.io.Serializable;

public class AdjectiveDTO implements Serializable {

    private long id;

    private String name;

    private String romaji;

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

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }
}
