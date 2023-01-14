package com.argonaute.wcs.service;

import com.argonaute.wcs.entity.Crew;

import java.util.List;

public interface ICrewService {

    public List<Crew> getAll();
    public Crew create(Crew crew);


}
