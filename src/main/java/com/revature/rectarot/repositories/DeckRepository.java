package com.revature.rectarot.repositories;

import com.revature.rectarot.models.Deck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeckRepository extends CrudRepository<Deck, UUID> {
}
