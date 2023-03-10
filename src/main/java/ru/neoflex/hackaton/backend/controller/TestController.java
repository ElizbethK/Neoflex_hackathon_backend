package ru.neoflex.hackaton.backend.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.hackaton.backend.dto.StudentsTestResultDto;
import ru.neoflex.hackaton.backend.dto.TestDto;
import ru.neoflex.hackaton.backend.service.AnswerService;
import ru.neoflex.hackaton.backend.service.QuestionService;
import ru.neoflex.hackaton.backend.service.TestService;



@RestController
@RequiredArgsConstructor
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(ru.neoflex.hackaton.backend.controller.TestController.class);
    @Autowired
    AnswerService answerService;
    @Autowired
    QuestionService questionService;
    @Autowired
    TestService testService;

    @GetMapping("/test/{test_id}")
    public TestDto getTestDto(@PathVariable(value = "test_id") Long testId) {
        logger.info("Got test_id = {}", testId);
        return testService.getTestDtoListByTestId(testId);
    }

    @PostMapping("/test")
    public Double calculateResult(@RequestBody StudentsTestResultDto studentsTestResultDto){
        return testService.calculateStudentResult(studentsTestResultDto);
    }

}
