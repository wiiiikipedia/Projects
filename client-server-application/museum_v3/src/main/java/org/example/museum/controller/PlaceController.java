package org.example.museum.controller;

import org.example.museum.db.entity.Museum;
import org.example.museum.db.entity.Place;
import org.example.museum.db.repository.MuseumRepository;
import org.example.museum.db.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/place")
public class PlaceController {

    private final PlaceRepository placeRepository;
    @Autowired
    public PlaceController (PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }

    @GetMapping()
    public Iterable<Place> getPlace() {
        return placeRepository.findAll();
    }

    @PostMapping()
    public Place createObject(
            @RequestBody Place object
    ) {
        return placeRepository.save(object);
    }

    @PutMapping("/{id}/{newName}}")
    public Place changeName(
            @PathVariable Long id,
            @PathVariable String newName
    ) {
        Place object = placeRepository.findById(id).get();
        object.setPlace_name(newName);
        return placeRepository.save(object);
    }

    @DeleteMapping("/{id}/delete")
    void deleteLabel(
            @PathVariable Long id
    ) {
        placeRepository.deleteById(id);
    }
}
