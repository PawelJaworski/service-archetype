package ${groupId}.adapter;

import java.util.Optional;

import pl.asc.edu.plannig.domain.EntityPoc;
import pl.asc.edu.plannig.domain.RepositoryPoc;

public class RepositoryPocInMemoryAdapter implements RepositoryPoc {
  @Override
  public Optional<EntityPoc> findSingle() {
    return Optional.of(new EntityPoc("This is Proof of Concept."));
  }
}
