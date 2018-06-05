package com.naki.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> listAllExercises() {
        System.out.println("Before finding all exercise");
        return exerciseRepository.findAll();
    }
}
