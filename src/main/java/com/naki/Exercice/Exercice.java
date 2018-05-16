package com.naki.Exercice;

import com.naki.Asset.Asset;
import com.naki.Cours.Cours;
import com.naki.Theme.Theme;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "exercice", schema ="public")
public class Exercice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "question_asset_item")
    private String question_asset_item;

    @Column(name = "good_question_item")
    private String good_question_item;

    @Column(name = "answer_question_item")
    private String answer_question_item;

    @Column(name = "exercice_order")
    private int exercice_order;

    @OneToMany
    private List<Cours> cours = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "Exercice_Asset", joinColumns = @JoinColumn(name = "exercice_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "id"))
    private List<Asset> asset= new ArrayList<>();


    public Long getId(){ return id; }

    public String getQuestion_asset_item(){ return question_asset_item;}

    public String getGood_question_item(){ return good_question_item;}

    public String getAnswer_question_item(){ return answer_question_item;}

    public Integer getExerciceOrder(){ return exercice_order;}

    public Long setId(){ return id;}

    public String setQuestion_asset_item(){ return question_asset_item;}

    public String setGood_question_item(){ return good_question_item;}

    public String setAnswer_question_item(){ return answer_question_item;}

    public Integer setExerciceOrder(){ return exercice_order;}

    public Exercice(){}

    public Exercice(String question_asset_item, String good_question_item, String answer_question_item, int exercice_order) {
        this.question_asset_item = question_asset_item;
        this.good_question_item= good_question_item;
        this.answer_question_item= answer_question_item;
        this.exercice_order= exercice_order;

    }
}
