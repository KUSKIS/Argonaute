package com.argonaute.wcs.repository;

import com.argonaute.wcs.entity.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrewRepository extends JpaRepository <Crew, Integer>{

}
