package com.naki.Cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursService {

    @Autowired(required=true)
    private CoursRepository coursRepository;

    public List<Cours> listAllCours() {
        System.out.println("Before finding all cours");
        return coursRepository.findAll();
    }
}