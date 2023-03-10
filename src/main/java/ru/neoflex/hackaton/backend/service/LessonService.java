package ru.neoflex.hackaton.backend.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.hackaton.backend.dto.LessonDto;
import ru.neoflex.hackaton.backend.entity.Lesson;
import ru.neoflex.hackaton.backend.repository.LessonRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class LessonService {
    private static final Logger logger = LoggerFactory.getLogger(LessonService.class);
    @Autowired
    private LessonRepository lessonRepository;
    @Autowired
    private ModelMapper modelMapper;


    public Lesson getByLessonId(Long lessonId){
        lessonRepository.findById(lessonId);
        return lessonRepository.findById(lessonId).get();
    }

    public List<Lesson> getByLessonIdIsFinished(Long lessonId){
        return lessonRepository.findAllByLessonIdIsFinished(lessonId);
    }

    public List<Lesson> getAll(){
        return lessonRepository.findAll();
    }

    public LessonDto convertToLessonDto(Lesson lesson) {
        return modelMapper.map(lesson, LessonDto.class);
    }

    public List<LessonDto> convertToLessonDtoList(List<Lesson> lessons){
        List<LessonDto> allLessonsDto = new ArrayList<>();
        for (Lesson lesson:lessons) {
            LessonDto lessonDto = new LessonDto();
            lessonDto.setId(lesson.getLessonId());
            lessonDto.setTitle(lesson.getTitle());
            lessonDto.setContent(lesson.getContent());
            lessonDto.setMedia(lesson.getMedia());

            allLessonsDto.add(lessonDto);
        }
        return allLessonsDto;
    }

}
