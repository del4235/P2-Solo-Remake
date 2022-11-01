package com.revature.rectarot.repositories;

import com.revature.rectarot.models.Spread;
import com.revature.rectarot.models.enums.EnumSpread;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpreadRepository extends CrudRepository<Spread, EnumSpread> {
}
