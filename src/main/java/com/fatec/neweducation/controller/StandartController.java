package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.model.dto.FakeStandart;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.StandartService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/standart")
public class StandartController {

    @Autowired
    private StandartService standartService;

    @Autowired
    private PlayerService playerService;

    private String messageError = "";

    private String messageSuccess = "";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeStandart");
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.GET)
    public ModelAndView initAddSchool(@PathVariable Integer id) {
        this.limparMessage();
        ModelAndView modelAndView = new ModelAndView("formStandart");
        FakeStandart standart = new FakeStandart();
        standart.setIdPlayer(id);
        modelAndView.addObject("title", "Adicionar Questionario a aluno");
        modelAndView.addObject("standart", standart);
        modelAndView.addObject("habilities", Hability.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.POST)
    public String save(@ModelAttribute("standartmodel") FakeStandart standartmodel, HttpSession session) {
        this.limparMessage();
        Player player = this.playerService.findById(standartmodel.getIdPlayer());
        standartmodel.setPlayer(player);
        Standart standart = standartmodel.getStandart();
        this.standartService.save(standart);
        this.messageSuccess = "Questionário: " + standart.getHability().getValor() + " nível : " + standart.getDifficulty() + " foi removido com sucesso!";
        session.setAttribute("sessionMessageSucess", messageSuccess);
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public String initEditSchool(@PathVariable Integer id) {
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute School school, @PathVariable Long id) {
        return "redirect:/player";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id, HttpSession session) {
        this.limparMessage();
        Standart standart = this.standartService.findById(id);
        this.messageSuccess = "Questionário: " + standart.getHability().getValor() + " nível : " + standart.getDifficulty() + " foi removido com sucesso!";
        this.standartService.delete(standart);
        session.setAttribute("sessionMessageSucess", messageSuccess);
        return "redirect:/player";
    }

    private void limparMessage() {
        this.messageError = "";
        this.messageSuccess = "";
    }
}
