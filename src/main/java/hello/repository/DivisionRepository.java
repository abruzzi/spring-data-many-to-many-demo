package hello.repository;

import hello.model.Division;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Long> {
}
