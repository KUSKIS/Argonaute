package com.argonaute.wcs.controller;



import com.argonaute.wcs.entity.Crew;
import com.argonaute.wcs.service.ICrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController
//@RequestMapping("/argonaute")

public class CrewController {

    @Autowired
    private ICrewService service;


    /*
    @GetMapping("/create")
    public ModelAndView getAll(){
        List<Crew> crew = service.getAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("index", crew);
        return mav;
    }
    */


/*
    @GetMapping("")
    public List<Crew> getAll(){
        return service.getAll();
    }

    @PostMapping("")
    public Crew createCrew(Crew crew){
        return service.create(crew);
    }
    /*
    @GetMapping("")
    public ResponseEntity<List<Crew>> getAll() {
        List<Crew> crewList = service.getAll();
        if(crewList == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(crewList);
    }

    /*
    @GetMapping("/{id}")
    public ResponseEntity<Crew> getById(@PathVariable("id") int id) {
        Crew crew = service.getById(id);
        if(crew == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(crew);
    }*/

    /*
    @PostMapping("")
    public ResponseEntity<String> addCrew(@RequestBody Crew crew) {
        String createdCrew = service.create(crew);
        return ResponseEntity.ok().body(createdCrew);

    }

    /*
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCrew(@PathVariable("id") int id) {
        String deletedCrew = service.delete(id);
        return ResponseEntity.ok().body(deletedCrew);
    }

    @PutMapping("")
    public ResponseEntity<String> updateCrew(@RequestBody Crew crew) {
        String updatedCrew = service.update(crew);
        if(updatedCrew == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updatedCrew);
    }*/

}
