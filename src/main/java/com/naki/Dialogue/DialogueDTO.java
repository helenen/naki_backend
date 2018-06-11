package com.naki.Dialogue;

import com.naki.Theme.Theme;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

public class DialogueDTO implements Serializable {

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

    public void setName(String name) {
        this.name = name;
    }


    public DialogueDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
