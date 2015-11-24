package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.dto.FakeUserPlayer;
import com.fatec.neweducation.model.resources.Gender;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.SchoolService;
import com.fatec.neweducation.service.StandartService;
import com.fatec.neweducation.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/player")
public class PlayerController {


    @Autowired
    private PlayerService playerService;

    @Autowired
    private UserService userService;

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private StandartService standartService;

    private String messageError = "";

    private String messageSuccess = "";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list(HttpSession session) {
        this.getMessageBySession(session);
        ModelAndView modelAndView = new ModelAndView("homePlayer");
        modelAndView.addObject("title", "Estudantes");
        modelAndView.addObject("players", this.playerService.findAll());
        modelAndView.addObject("messageError", messageError);
        modelAndView.addObject("messageSuccess", messageSuccess);
        limparMessage();
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddPlayer() {
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        FakeUserPlayer player = new FakeUserPlayer();
        modelAndView.addObject("title", "Adicionar Estudante");
        modelAndView.addObject("player", player);
        modelAndView.addObject("genders", Gender.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("modelplayer") FakeUserPlayer modelPlayer) {
        this.playerService.save(modelPlayer.getPlayer());
        this.messageSuccess = "Estudante " + modelPlayer.getName() + " foi salvo com sucesso";
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditPlayer(@PathVariable Integer id) {
        Player player = this.playerService.findById(id);
        FakeUserPlayer psg = new FakeUserPlayer();
        psg.setUser(player.getFkUser());
        psg.setPlayer(player);
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        modelAndView.addObject("title", "Editar Estudante");
        modelAndView.addObject("player", psg);
        modelAndView.addObject("genders", Gender.values());
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute FakeUserPlayer modelFakePlayer, @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("homePlayer");
        this.playerService.update(modelFakePlayer.getPlayer());
        this.messageSuccess = "Estudante " + modelFakePlayer.getName() + " editado com sucesso !";
        return "redirect:/player";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        Player player = this.playerService.findById(id);
        this.playerService.delete(player.getId());
        this.messageSuccess = "Estudante removido com sucesso !";
        return "redirect:/player";
    }

    @RequestMapping(value = "/view{id}", method = RequestMethod.GET)
    public ModelAndView initView(@PathVariable Integer id) {
        Player player = this.playerService.findById(id);
        FakeUserPlayer psg = new FakeUserPlayer();
        psg.setUser(player.getFkUser());
        psg.setPlayer(player);
        psg.setListSchool(this.playerSchoolGradeService.findByPlayer(player));
        psg.setListStandart(this.standartService.findByPlayer(player));
        ModelAndView modelAndView = new ModelAndView("viewPlayer");
        modelAndView.addObject("title", "Visualizar Estudante");
        modelAndView.addObject("player", psg);
        return modelAndView;
    }

    private void limparMessage() {
        this.messageError = "";
        this.messageSuccess = "";
    }

    private void getMessageBySession(HttpSession session) {
        if (session.getAttribute("sessionMessageError") != "") {
            this.messageError = (String) session.getAttribute("sessionMessageError");
            session.removeAttribute("sessionMessageError");
        }
        if (session.getAttribute("sessionMessageSuccess") != "") {
            this.messageSuccess = (String) session.getAttribute("sessionMessageSuccess");
            session.removeAttribute("sessionMessageSuccess");
        }
    }

}
