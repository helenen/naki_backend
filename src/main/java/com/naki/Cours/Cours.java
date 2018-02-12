package com.naki.Cours;


import com.naki.Level.Level;
import com.naki.Theme.Theme;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cours", schema ="public")
public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Level level;

    @OneToOne
    private Theme theme;
}

