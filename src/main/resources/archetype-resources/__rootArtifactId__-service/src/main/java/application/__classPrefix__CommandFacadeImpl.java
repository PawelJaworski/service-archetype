package ${groupId}.application;

import lombok.RequiredArgsConstructor;
import ${groupId}.domain.EntityPoc;
import ${groupId}.domain.RepositoryPoc;

@RequiredArgsConstructor
public final class ${classPrefix}CommandFacadeImpl implements ${classPrefix}CommandFacade {
    private final RepositoryPoc repositoryPoc;

    @Override
    public void savePoc(String pocValue) {
        repositoryPoc.delete();
        repositoryPoc.save( new EntityPoc(pocValue) );
    }
}
