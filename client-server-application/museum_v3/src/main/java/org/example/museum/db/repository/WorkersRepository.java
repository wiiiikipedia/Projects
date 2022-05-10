package org.example.museum.db.repository;

import org.example.museum.db.entity.Workers;
import org.springframework.data.repository.CrudRepository;

public interface WorkersRepository extends CrudRepository<Workers, Long> {
}
