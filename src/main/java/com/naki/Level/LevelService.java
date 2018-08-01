package com.naki.Level;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LevelService {

    List<Level> listAllLevels();
}
