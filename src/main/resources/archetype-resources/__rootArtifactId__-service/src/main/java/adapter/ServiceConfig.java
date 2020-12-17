package ${groupId}.adapter;

import lombok.Builder;

import ${groupId}.${classPrefix}QueryFacade;
import ${groupId}.${classPrefix}QueryFacadeImpl;
import ${groupId}.application.${classPrefix}CommandFacade;
import ${groupId}.application.${classPrefix}CommandFacadeImpl;
import ${groupId}.domain.RepositoryPoc;

public final class ServiceConfig {
  @Builder.Default
  private final RepositoryPoc repositoryPoc = new RepositoryPocInMemoryAdapter();
  public final ${classPrefix}QueryFacade queryFacade;
  public final ${classPrefix}CommandFacade commandFacade;

  @Builder
  private ServiceConfig(RepositoryPoc repositoryPoc) {
    this.queryFacade = new ${classPrefix}QueryFacadeImpl(repositoryPoc);
    this.commandFacade = new ${classPrefix}CommandFacadeImpl(repositoryPoc);
  }
}