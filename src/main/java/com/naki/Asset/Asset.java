package com.naki.Asset;

import com.naki.Cours.Cours;
import com.naki.Exercice.Exercice;
import com.naki.Lesson.Lesson;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "asset", schema ="public")
public class Asset implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String value;

    @Column(name = "asset_order")
    private int asset_order;

    public Long getId(){ return id; }

    public String getType(){ return type;}

    public String getValue(){ return value;}

    public Integer getAssetOrder(){ return asset_order;}

    public Long setId(){ return id;}

    public String setType(){ return type;}

    public String setValue(){ return value;}

    public Integer setAssetOrder(){ return asset_order;}

    @ManyToMany
    private List<Lesson> lesson = new ArrayList<>();

    @JoinTable(name = "Cours_Asset", joinColumns = @JoinColumn(name = "cours_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "id"))
    @ManyToMany
    private List<Cours> cours = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Exercice_Asset", joinColumns = @JoinColumn(name = "exercice_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "id"))
    private List<Exercice> exercice= new ArrayList<>();

    public Asset(){};
    public Asset(String type, String value, int asset_order) {
        this.type = type;
        this.value= value;
        this.asset_order= asset_order;

    }
}
