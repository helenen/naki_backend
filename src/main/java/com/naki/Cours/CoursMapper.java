package com.naki.Cours;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoursMapper {

    CoursDTO coursToCoursDto(Cours cours);
}
