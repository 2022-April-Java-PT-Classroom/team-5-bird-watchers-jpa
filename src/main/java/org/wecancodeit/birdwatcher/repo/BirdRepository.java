package org.wecancodeit.birdwatcher.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.BirdModel;

public interface BirdRepository extends CrudRepository <BirdModel, Long> {
}
