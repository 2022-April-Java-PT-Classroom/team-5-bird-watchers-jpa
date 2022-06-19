package org.wecancodeit.birdwatcher.repo;


import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.habitatModel;

public interface habitatRepository extends CrudRepository<habitatModel, Long> {
}
