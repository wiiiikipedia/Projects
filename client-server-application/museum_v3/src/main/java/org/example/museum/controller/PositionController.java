package org.example.museum.controller;

import org.example.museum.db.entity.Place;
import org.example.museum.db.entity.Position;
import org.example.museum.db.repository.PlaceRepository;
import org.example.museum.db.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/position")
public class PositionController {

    private final PositionRepository positionRepository;
    @Autowired
    public PositionController (PositionRepository positionRepository){
        this.positionRepository = positionRepository;
    }

    @GetMapping()
    public Iterable<Position> getPosition() {
        return positionRepository.findAll();
    }

    @PostMapping()
    public Position createObject(
            @RequestBody Position object
    ) {
        return positionRepository.save(object);
    }

    @PutMapping("/{id}/{newName}")
    public Position changeName(
            @PathVariable Long id,
            @PathVariable String newName
    ) {
        Position object = positionRepository.findById(id).get();
        object.setPosition_name(newName);
        return positionRepository.save(object);
    }

    @DeleteMapping("/{id}/delete")
    void deleteLabel(
            @PathVariable Long id
    ) {
        positionRepository.deleteById(id);
    }
}
