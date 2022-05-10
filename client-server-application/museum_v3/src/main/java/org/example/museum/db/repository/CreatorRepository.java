package org.example.museum.db.repository;

import org.example.museum.db.entity.Creator;
import org.springframework.data.repository.CrudRepository;

public interface CreatorRepository extends CrudRepository<Creator, Long> {
}
