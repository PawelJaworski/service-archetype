package ${groupId}.adapter;

import java.util.Optional;

import ${groupId}.domain.EntityPoc;
import ${groupId}.domain.RepositoryPoc;

public class RepositoryPocInMemoryAdapter implements RepositoryPoc {
  private Optional<EntityPoc> entityPoc = Optional.empty();

  @Override
  public void save(EntityPoc entityPoc) {
    this.entityPoc = Optional.of(entityPoc);
  }

  @Override
  public Optional<EntityPoc> findSingle() {
    return entityPoc;
  }

  @Override
  public void delete() {
    this.entityPoc = Optional.empty();
  }
}
