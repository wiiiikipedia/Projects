package org.example.museum.db.repository;

import org.example.museum.db.entity.Museum;
import org.springframework.data.repository.CrudRepository;

public interface MuseumRepository extends CrudRepository<Museum, Long> {
}
