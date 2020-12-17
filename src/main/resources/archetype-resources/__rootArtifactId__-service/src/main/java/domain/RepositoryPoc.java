package ${groupId}.domain;

import java.util.Optional;

public interface RepositoryPoc {
  void save(EntityPoc entityPoc);
  Optional<EntityPoc> findSingle();
  void delete();
}
