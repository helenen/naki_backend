package com.naki.SubTheme;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubThemeRepository extends CrudRepository<SubTheme, Long> {

    List<SubTheme> findAll();
}
