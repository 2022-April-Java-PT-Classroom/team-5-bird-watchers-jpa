package org.wecancodeit.birdwatcher.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.Continent;

public interface ContinentRepository extends CrudRepository <Continent, Long> {

}
