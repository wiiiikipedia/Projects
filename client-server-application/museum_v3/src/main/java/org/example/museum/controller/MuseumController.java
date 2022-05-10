package org.example.museum.controller;

import org.example.museum.db.entity.Museum;
import org.example.museum.db.repository.MuseumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/museum")
public class MuseumController {

    private final MuseumRepository museumRepository;
    @Autowired
    public MuseumController (MuseumRepository museumRepository){
        this.museumRepository = museumRepository;
    }

    @GetMapping()
    public Iterable<Museum> getMuseum() {
        return museumRepository.findAll();
    }

    @PostMapping()
    public Museum createObject(
            @RequestBody Museum object
    ) {
        return museumRepository.save(object);
    }

    @PutMapping("/{id}/{newName}")
    public Museum changeName(
        @PathVariable Long id,
        @PathVariable String newName
    ) {
            Museum object = museumRepository.findById(id).get();
            object.setObject_name(newName);
            return museumRepository.save(object);
    }

    @DeleteMapping("/{id}/delete")
    void deleteLabel(
            @PathVariable Long id
    ) {
        museumRepository.deleteById(id);
    }

}
