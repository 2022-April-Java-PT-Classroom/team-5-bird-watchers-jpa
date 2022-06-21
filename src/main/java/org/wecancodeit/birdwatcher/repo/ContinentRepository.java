package org.wecancodeit.birdwatcher.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.ContinentModel;

public interface ContinentRepository extends CrudRepository <ContinentModel, Long> {

}
