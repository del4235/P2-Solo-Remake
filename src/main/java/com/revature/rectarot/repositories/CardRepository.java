package com.revature.rectarot.repositories;

import com.revature.rectarot.models.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends CrudRepository<Card, String> {
    /*methods in super
    * save()
    * findById()
    * findAll()
    * count()
    * deleteById()
    *  */
}
