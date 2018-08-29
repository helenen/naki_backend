package com.naki.Exercise;


import com.naki.Asset.Asset;
import com.naki.Chapter.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("/exercises")
    public List<Exercise> getAllExercises() {
        return exerciseService.listAllExercises();
    }

    @GetMapping("/exercise/{id}/assets")
    public List<Asset> getAllAssetsByExercise( @PathVariable Long id) {
        return exerciseService.findById(id).getAsset();
    }
}
