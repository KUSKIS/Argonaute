package com.argonaute.wcs.service;

import com.argonaute.wcs.repository.ICrewRepository;
import com.argonaute.wcs.entity.Crew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrewService implements ICrewService{


    @Autowired
    private ICrewRepository repository;

    @Override
    public List<Crew> getAll() {
        return repository.findAll();
    }


    @Override
    public Crew create(Crew crew) {
        repository.save(crew);
        System.out.println("service.create");
        return crew;
    }


    public ICrewRepository getRepository() {
        return repository;
    }

    public void setRepository(ICrewRepository repository) {
        this.repository = repository;
    }
}
