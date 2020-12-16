package ${groupId}.domain;

import java.util.Optional;

public interface RepositoryPoc {
  Optional<EntityPoc> findSingle();
}
