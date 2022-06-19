package org.wecancodeit.birdwatcher.repo;
import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.Countries;

public interface countriesRepository extends CrudRepository<Countries, Long> {
}
