package com.naki.Level;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LevelRepository extends CrudRepository<Level, Long> {
    List<Level> findAll();
    Level findOne(Long id);
    //Level findLevelId(Long id);
}
