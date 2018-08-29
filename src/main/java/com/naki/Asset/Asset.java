package com.naki.Asset;

import com.naki.Category.Category;
import com.naki.Exercise.Exercise;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "asset", schema ="public")
public class Asset implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String value;

    @Column(name = "asset_order")
    private int asset_order;


    @Column(name = "transcription")
    private String transcription;

    public Long getId(){ return id; }

    public String getType(){ return type;}

    public String getValue(){ return value;}

    public Integer getAssetOrder(){ return asset_order;}

    public String getTranscription() {
        return transcription;
    }

    public Long setId(){ return id;}

    public String setType(){ return type;}

    public String setValue(){ return value;}

    public Integer setAssetOrder(){ return asset_order;}

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Category category;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Exercise exercise;

    public Exercise getExercise(){ return exercise;}
    public Asset(){};
    public Asset(String type, String value, int asset_order, String transcription) {
        this.type = type;
        this.value= value;
        this.asset_order= asset_order;
        this.transcription = transcription;

    }
}
