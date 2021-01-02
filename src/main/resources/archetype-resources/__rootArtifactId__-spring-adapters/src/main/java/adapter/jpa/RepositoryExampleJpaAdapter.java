package ${groupId}.adapter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ${groupId}.domain.EntityExample;
import ${groupId}.domain.RepositoryExample;

import java.util.Optional;

@Repository
public interface RepositoryExampleJpaAdapter extends RepositoryExample, JpaRepository<EntityExampleJpaAdapter, String> {

    @Override
    default void save(EntityExample entityExample) {
        EntityExampleJpaAdapter entityExampleJpaAdapter = EntityExampleJpaAdapter.fromEntity(entityExample);
        save(entityExampleJpaAdapter);
    }

    @Override
    default Optional<EntityExample> findSingle() {
        return findAll().stream()
                .map(EntityExampleJpaAdapter::toEntity)
                .findFirst();
    }

    @Override
    default void delete() {
        deleteAll();
    }
}
