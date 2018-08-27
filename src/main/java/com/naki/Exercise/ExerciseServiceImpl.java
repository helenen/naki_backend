package com.naki.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> listAllExercises() {
        System.out.println("Before finding all exercise");
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise findById(Long id){
        return exerciseRepository.findOne(id);}

    }

