package ru.neoflex.hackaton.backend.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.hackaton.backend.dto.LessonDto;
import ru.neoflex.hackaton.backend.entity.Lesson;
import ru.neoflex.hackaton.backend.service.LessonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LessonController {
    private static final Logger logger = LoggerFactory.getLogger(LessonController.class);
    @Autowired
    private LessonService lessonService;


    @GetMapping("/lesson/{lesson_id}")
    public List<LessonDto> getLessonByLessonId(@PathVariable(value = "lesson_id") Long lessonId){
        List<Lesson> lessonList = lessonService.getByLessonIdIsFinished(lessonId);
        return lessonService.convertToLessonDtoList(lessonList);
    }

}
