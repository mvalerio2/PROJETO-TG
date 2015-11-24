package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.dto.FakePlayerSchoolGrade;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.SchoolService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/playerschool")
public class PlayerSchoolGradeController {


    @Autowired
    private PlayerService playerService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    private String messageError = "";

    private String messageSuccess = "";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homePlayer");
        modelAndView.addObject("title", "Estudantes");
        modelAndView.addObject("players", this.playerService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.GET)
    public ModelAndView initAddPlayerSchool(@PathVariable Integer id) {
        this.limparMessage();
        ModelAndView modelAndView = new ModelAndView("formPlayerSchool");
        FakePlayerSchoolGrade psg = new FakePlayerSchoolGrade();
        psg.setIdPlayerSchoolGrade(id);
        modelAndView.addObject("title", "Adicionar Escola ao Estudante");
        modelAndView.addObject("player", psg);
        modelAndView.addObject("schools", this.schoolService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.POST)
    public String save(@ModelAttribute("modelPlayer") FakePlayerSchoolGrade modelPlayerSchool, @PathVariable Integer id, HttpSession session) {
        School school = this.schoolService.findById(modelPlayerSchool.getIdSchool());
        Player player = this.playerService.findById(id);
        modelPlayerSchool.setSchool(school);
        modelPlayerSchool.setPlayer(player);
        PlayerSchoolGrade psg = modelPlayerSchool.getPlayerSchoolGrade();
        psg.setActive(Boolean.TRUE);
        this.playerSchoolGradeService.save(psg);
        this.messageSuccess = "Escola " + modelPlayerSchool.getSchool().getTitle() + " foi adicionada com sucesso ao aluno";
        session.setAttribute("sessionMessageSucess", messageSuccess);
        this.limparMessage();
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditPlayer(@PathVariable Integer id) {
        this.limparMessage();
        PlayerSchoolGrade playerSchool = this.playerSchoolGradeService.findById(id);
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        modelAndView.addObject("title", "Editar Estudante");
        modelAndView.addObject("playerSchool", playerSchool);
        modelAndView.addObject("schools", this.schoolService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute PlayerSchoolGrade playerSchool, @PathVariable Long id, HttpSession session) {
        this.playerSchoolGradeService.update(playerSchool);
        this.messageSuccess = "Escola " + playerSchool.getFkSchool().getTitle() + " editada com sucesso!";
        session.setAttribute("sessionMessageSucess", messageSuccess);
        this.limparMessage();
        return "redirect:/player";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id, HttpSession session) {
        this.playerSchoolGradeService.delete(id);
        this.messageSuccess = "Escola removida com sucesso!";
        session.setAttribute("sessionMessageSucess", messageSuccess);
        this.limparMessage();
        return "redirect:/player";
    }

    private void limparMessage() {
        this.messageError = "";
        this.messageSuccess = "";
    }
}
