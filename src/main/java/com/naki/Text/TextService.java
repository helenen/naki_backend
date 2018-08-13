package com.naki.Text;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TextService {

    List<Text> listAllTexts();

    Text findById(Long id);
}
