package com.fatec.neweducation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/question")
public class QuestionController {


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView homeQuestions() {
        ModelAndView modelAndView = new ModelAndView("homeQuestions");
        modelAndView.addObject("title", "Escolha o tipo de FAE");
        return modelAndView;
    }

}
