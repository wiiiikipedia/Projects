package org.example.museum.db.repository;

import org.example.museum.db.entity.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<Position, Long> {
}
