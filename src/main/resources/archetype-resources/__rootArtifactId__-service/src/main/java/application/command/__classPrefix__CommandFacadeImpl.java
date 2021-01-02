package ${groupId}.application.command;

import lombok.RequiredArgsConstructor;
import ${groupId}.domain.EntityExample;
import ${groupId}.domain.RepositoryExample;

@RequiredArgsConstructor
public final class ${classPrefix}CommandFacadeImpl implements ${classPrefix}CommandFacade {
    private final RepositoryExample RepositoryExample;

    @Override
    public void savePoc(String pocValue) {
        RepositoryExample.delete();
        RepositoryExample.save( new EntityExample(pocValue) );
    }
}
