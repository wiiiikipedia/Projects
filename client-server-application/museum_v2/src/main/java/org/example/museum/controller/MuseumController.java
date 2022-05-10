package org.example.museum.controller;

import org.example.museum.db.entity.Museum;
import org.example.museum.db.repository.MuseumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MuseumController {

    private final MuseumRepository museumRepository;
    @Autowired
    public MuseumController (MuseumRepository museumRepository){
        this.museumRepository = museumRepository;
    }

    @GetMapping("/api/museum")
    public Iterable<Museum> getMuseum() {
        return museumRepository.findAll();
    }

}
