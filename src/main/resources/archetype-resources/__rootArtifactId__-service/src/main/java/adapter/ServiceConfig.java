package ${groupId}.adapter;

import lombok.Builder;

import ${groupId}.${classPrefix}QueryFacade;
import ${groupId}.${classPrefix}QueryFacadeImpl;
import ${groupId}.application.${classPrefix}CommandFacade;
import ${groupId}.application.${classPrefix}CommandFacadeImpl;
import ${groupId}.domain.RepositoryPoc;

public final class ServiceConfig {
  @Builder.Default
  private final RepositoryPoc repositoryPoc;

  public final ${classPrefix}QueryFacade queryFacade;
  public final ${classPrefix}CommandFacade commandFacade;

  @Builder
  private ServiceConfig(RepositoryPoc repositoryPoc) {
    this.repositoryPoc = newRepositoryPoc(repositoryPoc);

    this.queryFacade = new ${classPrefix}QueryFacadeImpl(this.repositoryPoc);
    this.commandFacade = new ${classPrefix}CommandFacadeImpl(this.repositoryPoc);
  }

  private RepositoryPoc newRepositoryPoc(RepositoryPoc repositoryPoc) {
    return repositoryPoc != null ? repositoryPoc : new RepositoryPocInMemoryAdapter();
  }
}