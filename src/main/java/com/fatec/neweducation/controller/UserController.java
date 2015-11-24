package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.TypeUser;
import com.fatec.neweducation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeUser");
        modelAndView.addObject("title", "Educadores");
        modelAndView.addObject("users", this.userService.findByType(TypeUser.EDUCADOR));
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddSchool() {
        ModelAndView modelAndView = new ModelAndView("formUser");
        User user = new User();
        modelAndView.addObject("title", "Adicionar Educador");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("usermodel") User usermodel) {
        ModelAndView modelAndView = new ModelAndView("homeUser");
        usermodel.setTypeUser(TypeUser.EDUCADOR);
        usermodel.setActive(Boolean.TRUE);
        this.userService.save(usermodel);
        modelAndView.addObject("message", "Educador " + usermodel.getNameUser() + " foi salvo com sucesso");
        return "redirect:/user";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditSchool(@PathVariable Integer id) {
        User user = this.userService.findById(id);
        ModelAndView modelAndView = new ModelAndView("formUser");
        modelAndView.addObject("title", "Editar Educador");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute User user, @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("homeUser");
        modelAndView.addObject("title", "Educadores");
        user.setTypeUser(TypeUser.EDUCADOR);
        this.userService.update(user);
        modelAndView.addObject("messagee", "Educador  " + user.getNameUser() + " editado com sucesso!");
        return "redirect:/user";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("homeUser");
        this.userService.delete(id);
        modelAndView.addObject("message", "Educador deletado com sucesso!");
        return "redirect:/user";
    }
}
