package org.wecancodeit.birdwatcher.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.regionModel;


public interface RegionRepository extends CrudRepository<regionModel,Long> {
}
