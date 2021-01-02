package ${groupId}.domain;

import java.util.Optional;

public interface RepositoryExample {
  void save(EntityExample EntityExample);
  Optional<EntityExample> findSingle();
  void delete();
}
