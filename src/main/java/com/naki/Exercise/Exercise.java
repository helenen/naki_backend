package com.naki.Exercise;

import com.naki.Asset.Asset;

import javax.persistence.*;
import java.io.Serializable;


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

    @Column(name = "answer_question_item1")
    private String answer_question_item1;

    @Column(name = "answer_question_item2")
    private String answer_question_item2;

    @Column(name = "answer_question_item3")
    private String answer_question_item3;

    @Column(name = "exercise_order")
    private int exercise_order;

    @ManyToOne
    private Asset asset;

    public Long getId(){ return id; }

    public String getQuestion_asset_item(){ return question_asset_item;}

    public String getGood_question_item(){ return good_question_item;}

    public String getAnswer_question_item1(){ return answer_question_item1;}

    public String getAnswer_question_item2() {
        return answer_question_item2;
    }

    public String getAnswer_question_item3() {
        return answer_question_item3;
    }

    public Integer getExerciseOrder(){ return exercise_order;}

    public Long setId(){ return id;}

    public String setQuestion_asset_item(){ return question_asset_item;}

    public String setGood_question_item(){ return good_question_item;}

    public String setAnswer_question_item1(){ return answer_question_item1;}

    public void setAnswer_question_item2(String answer_question_item2) {
        this.answer_question_item2 = answer_question_item2;
    }

    public void setAnswer_question_item3(String answer_question_item3) {
        this.answer_question_item3 = answer_question_item3;
    }

    public Integer setExerciseOrder(){ return exercise_order;}

    public Exercise(){}

    public Exercise(String question_asset_item, String good_question_item, String answer_question_item1, String answer_question_item2, String answer_question_item3, int exercise_order) {
        this.question_asset_item = question_asset_item;
        this.good_question_item= good_question_item;
        this.answer_question_item1= answer_question_item1;
        this.answer_question_item2 = answer_question_item2;
        this.answer_question_item3 = answer_question_item3;
        this.exercise_order= exercise_order;

    }
}
