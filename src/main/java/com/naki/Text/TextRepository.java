package com.naki.Text;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextRepository extends CrudRepository<Text, Long> {

    List<Text> findAll();

    Text findOne(Long id);
}
