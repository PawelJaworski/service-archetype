package ${groupId}.adapter;

import lombok.Builder;

import ${groupId}.application.query.${classPrefix}QueryFacade;
import ${groupId}.application.query.${classPrefix}QueryFacadeImpl;
import ${groupId}.application.command.${classPrefix}CommandFacade;
import ${groupId}.application.command.${classPrefix}CommandFacadeImpl;
import ${groupId}.domain.RepositoryExample;

public final class ServiceConfig {
  @Builder.Default
  private final RepositoryExample RepositoryExample;

  public final ${classPrefix}QueryFacade queryFacade;
  public final ${classPrefix}CommandFacade commandFacade;

  @Builder
  private ServiceConfig(RepositoryExample RepositoryExample) {
    this.RepositoryExample = newRepositoryExample(RepositoryExample);

    this.queryFacade = new ${classPrefix}QueryFacadeImpl(this.RepositoryExample);
    this.commandFacade = new ${classPrefix}CommandFacadeImpl(this.RepositoryExample);
  }

  private RepositoryExample newRepositoryExample(RepositoryExample RepositoryExample) {
    return RepositoryExample != null ? RepositoryExample : new RepositoryExampleInMemoryAdapter();
  }
}
