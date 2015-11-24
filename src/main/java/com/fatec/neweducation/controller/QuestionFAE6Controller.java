package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.dto.FakeQuestion;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeAnswer;
import com.fatec.neweducation.model.resources.TypeQuestion;
import com.fatec.neweducation.service.AnswerService;
import com.fatec.neweducation.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/question/FAE6")
public class QuestionFAE6Controller {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    private String messageError = "";

    private String messageSuccess = "";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE6");
        modelAndView.addObject("title", "Questões do tipo 6");
        modelAndView.addObject("questions", this.questionService.findByFAE(TypeQuestion.FAE6));
        modelAndView.addObject("messageError", messageError);
        modelAndView.addObject("messageSuccess", messageSuccess);
        limparMessage();
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddQuestion() {
        ModelAndView modelAndView = new ModelAndView("formQuestionFAE6");
        FakeQuestion question = new FakeQuestion();
        question.setTypeAnswer(TypeAnswer.FAE6);
        modelAndView.addObject("title", "Adicionar Questão do tipo 6");
        modelAndView.addObject("question", question);
        modelAndView.addObject("habilities", Hability.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("questionmodel") FakeQuestion questionmodel) {
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE6");
        Question question = questionmodel.getQuestion();
        question.setTypeQuestion(TypeQuestion.FAE6);
        Answer answerA = questionmodel.getAnswerA();
        answerA.setTypeAnswer(TypeAnswer.FAE6);
        answerA.setAudio(questionmodel.getAudioA());
        Answer answerB = questionmodel.getAnswerB();
        answerB.setTypeAnswer(TypeAnswer.FAE6);
        answerB.setAudio(questionmodel.getAudioA());
        Answer answerC = questionmodel.getAnswerC();
        answerC.setTypeAnswer(TypeAnswer.FAE6);
        answerC.setAudio(questionmodel.getAudioA());
        this.questionService.save(question);
        this.answerService.save(answerA);
        this.answerService.save(answerB);
        this.answerService.save(answerC);
        messageSuccess = "Questão salva com sucesso";
        return "redirect:/question/FAE6";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        this.questionService.delete(id);
        messageSuccess = "Questão removida com sucesso";
        return "redirect:/question/FAE6";
    }

    private void limparMessage() {
        this.messageError = "";
        this.messageSuccess = "";
    }
}
