package org.example.museum.controller;

import org.example.museum.db.entity.Workers;
import org.example.museum.db.repository.WorkersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/workers")
public class WorkersController {

    private final WorkersRepository workersRepository;
    @Autowired
    public WorkersController (WorkersRepository workersRepository){
        this.workersRepository = workersRepository;
    }

    @GetMapping()
    public Iterable<Workers> getWorker() {
        return workersRepository.findAll();
    }

    @PostMapping()
    public Workers createObject(
            @RequestBody Workers object
    ) {
        return workersRepository.save(object);
    }

    @PutMapping("/{id}/{newFirstName}/{newLastName}")
    public Workers changeName(
            @PathVariable Long id,
            @PathVariable String newFirstName,
            @PathVariable String newLastName
    ) {
        Workers object = workersRepository.findById(id).get();
        object.setFirst_name(newFirstName);
        object.setLast_name(newLastName);
        return workersRepository.save(object);
    }

    @DeleteMapping("/{id}/delete")
    void deleteLabel(
            @PathVariable Long id
    ) {
        workersRepository.deleteById(id);
    }
}
