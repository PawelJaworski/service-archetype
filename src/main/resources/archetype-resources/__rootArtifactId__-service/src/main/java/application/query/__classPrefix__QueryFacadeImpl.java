package ${groupId}.application.query;

import lombok.AllArgsConstructor;
import ${groupId}.domain.EntityExample;
import ${groupId}.domain.RepositoryExample;

@AllArgsConstructor
public class ${classPrefix}QueryFacadeImpl implements ${classPrefix}QueryFacade {
private final RepositoryExample repositoryExample;

    @Override
    public Result<String> getSingleResponseExample() {
        return repositoryExample.findSingle()
            .map(EntityExample::getValue)
            .map(Result::new)
            .orElseThrow(() -> new IllegalStateException("Cannot find single response."));
    }
}
