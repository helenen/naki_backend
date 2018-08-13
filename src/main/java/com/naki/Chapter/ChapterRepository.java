package com.naki.Chapter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, Long> {

    List<Chapter> findAll();

    Chapter findOne(Long id);
}
