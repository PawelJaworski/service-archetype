package ${groupId};

import lombok.AllArgsConstructor;
import ${groupId}.application.ResponsePoc;
import ${groupId}.domain.EntityPoc;
import ${groupId}.domain.RepositoryPoc;

@AllArgsConstructor
public class ${classPrefix}QueryFacadeImpl implements ${classPrefix}QueryFacade {
private final RepositoryPoc repositoryPoc;

    @Override
    public ResponsePoc getSingleResponsePoc() {
        return repositoryPoc.findSingle()
            .map(EntityPoc::getValue)
            .map(ResponsePoc::new)
            .orElseThrow(() -> new IllegalStateException("Cannot find single response."));
    }
}
