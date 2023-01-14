package com.argonaute.wcs.controller;

import com.argonaute.wcs.entity.Crew;
import com.argonaute.wcs.service.ICrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/argonaute")
public class CrewControllerWeb {

    @Autowired
    private ICrewService service;

    public void setService(ICrewService service) {
        this.service = service;
    }


/*
    @RequestMapping
    public String getForm(@ModelAttribute Crew crew){
        return "home";
    }
*/
    @RequestMapping
    public String getCrew(Model model, @ModelAttribute Crew crew){
        model.addAttribute("ListOfCrew", service.getAll());
        System.out.println(service.getAll());
        //System.out.println(repository.findAll());
        //service.getAll();
        return "home";
    }

    @PostMapping
    public String createCrew(Model model, @Valid @ModelAttribute Crew crew){
        model.addAttribute("ListOfCrew", service.getAll());
        service.create(crew);
        System.out.println("controller.create");

        //return "redirect:argonaute/show";
        return "home";
    }

    /*
    @PostMapping("/create")
    public String createCrew(@Valid @ModelAttribute Crew crews, BindingResult results){
        Crew crew = new Crew();
        crew.setName(crew.getName());
        System.out.println("c'est bon");
        return "index";
    }

    @RequestMapping("/show")
    public String showList(Model model){
        //List<Crew> crew = service.getAll();
        model.addAttribute("name", service.getAll());
        return "index";
    }*/
}
