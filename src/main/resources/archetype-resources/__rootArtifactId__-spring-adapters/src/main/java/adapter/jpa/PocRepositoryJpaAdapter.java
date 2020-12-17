package ${groupId}.adapter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ${groupId}.domain.EntityPoc;
import ${groupId}.domain.RepositoryPoc;

import java.util.Optional;

@Repository
public interface PocRepositoryJpaAdapter extends RepositoryPoc, JpaRepository<EntityPocJpaAdapter, String> {

    @Override
    default void save(EntityPoc entityPoc) {
        EntityPocJpaAdapter entityPocJpaAdapter = EntityPocJpaAdapter.fromEntity(entityPoc);
        save(entityPocJpaAdapter);
    }

    @Override
    default Optional<EntityPoc> findSingle() {
        return findAll().stream()
                .map(EntityPocJpaAdapter::toEntity)
                .findFirst();
    }

    @Override
    default void delete() {
        deleteAll();
    }
}
