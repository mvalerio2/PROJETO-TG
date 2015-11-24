package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.dto.FakeUserPlayer;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.service.GameService;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.StandartService;
import com.fatec.neweducation.service.UserService;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/result")
public class ResultController {


    @Autowired
    private PlayerService playerService;

    @Autowired
    private UserService userService;

    @Autowired
    private StandartService standartService;

    @Autowired
    private GameService gameService;

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeResult");
        modelAndView.addObject("title", "Resultado dos Estudantes");
        modelAndView.addObject("players", this.playerService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/view{id}", method = RequestMethod.GET)
    public ModelAndView initView(@PathVariable Integer id) {
        Player player = this.playerService.findById(id);
        FakeUserPlayer psg = new FakeUserPlayer();
        psg.setUser(player.getFkUser());
        psg.setPlayer(player);
        psg.setListSchool(this.playerSchoolGradeService.findByPlayer(player));
        psg.setListStandart(this.standartService.findByPlayer(player));
        ModelAndView modelAndView = new ModelAndView("viewResult");
        modelAndView.addObject("title", "Visualizar Estudante");
        modelAndView.addObject("player", psg);
        this.resultByPlayer(player, modelAndView);
        return modelAndView;
    }

    public void resultByPlayer(Player player, ModelAndView modelAndView) {
        for (Hability hab : Hability.values()) {
            modelAndView.addObject(hab.toString(), hab.getValor());
            Double value = this.gameService.acertsByPlayerAndHability(player, hab);
            NumberFormat number = new DecimalFormat("#0.00");
            if (value > 0) {
                modelAndView.addObject("player_" + hab, number.format(value) + " %");
            } else {
                modelAndView.addObject("player_" + hab, "não possui dados");
            }
            int numb = this.gameService.findByUserAndHability(player.getFkUser(), hab).size();
            modelAndView.addObject("player_numb_" + hab, numb);
        }
    }

}
