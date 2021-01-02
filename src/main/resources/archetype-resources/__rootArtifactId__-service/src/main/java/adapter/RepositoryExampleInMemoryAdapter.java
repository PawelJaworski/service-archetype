package ${groupId}.adapter;

import java.util.Optional;

import ${groupId}.domain.EntityExample;
import ${groupId}.domain.RepositoryExample;

public class RepositoryExampleInMemoryAdapter implements RepositoryExample {
  private Optional<EntityExample> EntityExample = Optional.of(new EntityExample("Entity example"));

  @Override
  public void save(EntityExample EntityExample) {
    this.EntityExample = Optional.of(EntityExample);
  }

  @Override
  public Optional<EntityExample> findSingle() {
    return EntityExample;
  }

  @Override
  public void delete() {
    this.EntityExample = Optional.empty();
  }
}
