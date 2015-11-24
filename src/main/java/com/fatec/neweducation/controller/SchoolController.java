package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.resources.City;
import com.fatec.neweducation.model.resources.State;
import com.fatec.neweducation.service.SchoolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    private String messageError = "";

    private String messageSuccess = "";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeSchool");
        modelAndView.addObject("title", "Escolas");
        List<School> list = this.schoolService.findAll();
        modelAndView.addObject("schools", list);
        modelAndView.addObject("messageError", messageError);
        modelAndView.addObject("messageSuccess", messageSuccess);
        limparMessage();
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddSchool() {
        ModelAndView modelAndView = new ModelAndView("formSchool");
        School school = new School();
        modelAndView.addObject("title", "Adicionar Escola");
        modelAndView.addObject("school", school);
        modelAndView.addObject("cities", City.values());
        modelAndView.addObject("states", State.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("schoolmodel") School schoolmodel) {
        schoolmodel.setActive(Boolean.TRUE);
        this.schoolService.save(schoolmodel);
        this.messageSuccess = "Escola " + schoolmodel.getTitle() + " foi salva com sucesso";
        return "redirect:/school";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditSchool(@PathVariable Integer id) {
        School school = this.schoolService.findById(id);
        ModelAndView modelAndView = new ModelAndView("formSchool");
        modelAndView.addObject("title", "Editar Escola");
        modelAndView.addObject("school", school);
        modelAndView.addObject("cities", City.values());
        modelAndView.addObject("states", State.values());
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute School school, @PathVariable Long id) {
        this.schoolService.update(school);
        this.messageSuccess = "Escola " + school.getTitle() + " editada com sucesso!";
        return "redirect:/school";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        this.schoolService.deleteById(id);
        this.messageSuccess = "Escola removida com sucesso!";
        return "redirect:/school";
    }

    private void limparMessage() {
        this.messageError = "";
        this.messageSuccess = "";
    }
}
