package com.naki.Exercise;

import com.naki.Asset.Asset;
import com.naki.Cours.Cours;
import com.naki.SubTheme.SubTheme;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "exercise", schema ="public")
public class Exercise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "question_asset_item")
    private String question_asset_item;

    @Column(name = "good_question_item")
    private String good_question_item;

    @Column(name = "answer_question_item")
    private String answer_question_item;

    @Column(name = "exercise_order")
    private int exercise_order;

    @OneToMany
    private List<Cours> cours = new ArrayList<>();

    @OneToMany
    private  List<SubTheme> subThemes = new  ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Exercise_Asset", joinColumns = @JoinColumn(name = "exercise_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "id"))
    private List<Asset> asset= new ArrayList<>();


    public Long getId(){ return id; }

    public String getQuestion_asset_item(){ return question_asset_item;}

    public String getGood_question_item(){ return good_question_item;}

    public String getAnswer_question_item(){ return answer_question_item;}

    public Integer getExerciseOrder(){ return exercise_order;}

    public Long setId(){ return id;}

    public String setQuestion_asset_item(){ return question_asset_item;}

    public String setGood_question_item(){ return good_question_item;}

    public String setAnswer_question_item(){ return answer_question_item;}

    public Integer setExerciseOrder(){ return exercise_order;}

    public Exercise(){}

    public Exercise(String question_asset_item, String good_question_item, String answer_question_item, int exercise_order) {
        this.question_asset_item = question_asset_item;
        this.good_question_item= good_question_item;
        this.answer_question_item= answer_question_item;
        this.exercise_order= exercise_order;

    }
}
