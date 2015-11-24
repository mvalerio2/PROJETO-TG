package com.fatec.neweducation.controller;

import com.fatec.neweducation.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/answer/")
public class AnswerController {

    @Autowired
    private AnswerService answerService;
}
