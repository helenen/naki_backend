package com.naki.Lesson;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LessonMapper {

    LessonDTO lessonToLessonDto(Lesson lesson);
}
