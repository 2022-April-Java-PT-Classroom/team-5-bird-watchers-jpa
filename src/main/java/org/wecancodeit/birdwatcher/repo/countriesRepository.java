package org.wecancodeit.birdwatcher.repo;
import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.countriesModel;

public interface countriesRepository extends CrudRepository<countriesModel, Long> {
}
