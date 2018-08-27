package com.naki.Exercise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExerciseService {

    Exercise findById(Long id);

    List<Exercise> listAllExercises();

}
