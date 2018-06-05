package com.naki.Exercise;

import java.io.Serializable;

public class ExerciseDTO implements Serializable {

    private Long id;

    private String question_asset_item;

    private String good_question_item;

    private String answer_question_item;

    private int exercise_order;

    public Long getId(){
        return  id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion_asset_item() {
        return question_asset_item;
    }

    public String getGood_question_item() {
        return good_question_item;
    }

    public String getAnswer_question_item() {
        return answer_question_item;
    }

    public int getExersice_order() {
        return exercise_order;
    }

    public String setQuestion_asset_item(String question_asset_item) {
        return question_asset_item = question_asset_item;
    }

    public String setGood_question_item(String good_question_item) {
        return good_question_item = good_question_item;
    }

    public String setAnswer_question_item(String answer_question_item) {
        return answer_question_item = answer_question_item;
    }

    public int setExercise_order(int exercise_order) {
        return exercise_order = exercise_order;
    }
}
