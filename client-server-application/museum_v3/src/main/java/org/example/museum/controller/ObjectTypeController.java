package org.example.museum.controller;

import org.example.museum.db.entity.Museum;
import org.example.museum.db.entity.ObjectType;
import org.example.museum.db.repository.MuseumRepository;
import org.example.museum.db.repository.ObjectTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/objecttype")
public class ObjectTypeController {

    private final ObjectTypeRepository objectTypeRepository;
    @Autowired
    public ObjectTypeController (ObjectTypeRepository objectTypeRepository){
        this.objectTypeRepository = objectTypeRepository;
    }

    @GetMapping()
    public Iterable<ObjectType> getObjectType() {
        return objectTypeRepository.findAll();
    }

    @PostMapping()
    public ObjectType createObject(
            @RequestBody ObjectType object
    ) {
        return objectTypeRepository.save(object);
    }

    @PutMapping("/{id}/{newName}")
    public ObjectType changeName(
            @PathVariable Long id,
            @PathVariable String newName
    ) {
        ObjectType object = objectTypeRepository.findById(id).get();
        object.setObject_type_name(newName);
        return objectTypeRepository.save(object);
    }

    @DeleteMapping("/{id}/delete")
    void deleteLabel(
            @PathVariable Long id
    ) {
        objectTypeRepository.deleteById(id);
    }

}
