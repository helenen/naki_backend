package com.naki.Cours;

import java.io.Serializable;
import java.util.List;

public class CoursDTO implements Serializable {

    private Long id;

    private String name;

    public Long getId(){ return id;}

    public String getName(){ return name;}

    public Long setId(){ return id;}

    public String setName(){ return name;}
}
