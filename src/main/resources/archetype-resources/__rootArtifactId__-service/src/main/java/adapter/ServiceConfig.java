package ${groupId}.adapter;

import lombok.Builder;

import ${groupId}.PokerPlanningQueryFacade;
import ${groupId}.PokerPlanningQueryFacadeImpl;
import ${groupId}.domain.RepositoryPoc;

public final class ServiceConfig {
  @Builder.Default
  private final RepositoryPoc repositoryPoc = new RepositoryPocInMemoryAdapter();
  public final ${classPrefix}QueryFacade queryFacade;

  @Builder
  public ServiceConfig(RepositoryPoc repositoryPoc) {
    this.queryFacade = new ${classPrefix}QueryFacadeImpl(repositoryPoc);
  }
}
