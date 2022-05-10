package org.example.museum.controller;

import org.example.museum.db.entity.Creator;
import org.example.museum.db.repository.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/creator")
public class CreatorController {

    private final CreatorRepository creatorRepository;
    @Autowired
    public CreatorController (CreatorRepository creatorRepository){
        this.creatorRepository = creatorRepository;
    }

    @GetMapping()
    public Iterable<Creator> getCreator() {
        return creatorRepository.findAll();
    }

    @PostMapping()
    public Creator createObject(
            @RequestBody Creator object
    ) {
        return creatorRepository.save(object);
    }

    @PutMapping("/{id}/{newFirstName}/{newLastName}")
    public Creator changeName(
            @PathVariable Long id,
            @PathVariable String newFirstName,
            @PathVariable String newLastName
    ) {
        Creator object = creatorRepository.findById(id).get();
        object.setFirst_name(newFirstName);
        object.setLast_name(newLastName);
        return creatorRepository.save(object);
    }

    @DeleteMapping("/{id}/delete")
    void deleteLabel(
            @PathVariable Long id
    ) {
        creatorRepository.deleteById(id);
    }
}
