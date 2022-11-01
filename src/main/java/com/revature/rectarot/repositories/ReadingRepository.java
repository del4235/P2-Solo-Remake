package com.revature.rectarot.repositories;

import com.revature.rectarot.models.Reading;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReadingRepository extends CrudRepository<Reading, UUID> {
}
