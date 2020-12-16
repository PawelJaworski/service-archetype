package ${groupId}.adapter;

import lombok.Builder;

import ${groupId}.PokerPlanningQueryFacade;
import ${groupId}.PokerPlanningQueryFacadeImpl;
import ${groupId}.domain.RepositoryPoc;

public final class ServiceConfig {
  @Builder.Default
  private final RepositoryPoc repositoryPoc = new RepositoryPocInMemoryAdapter();
  public final PokerPlanningQueryFacade queryFacade;

  @Builder
  public static ServiceConfig newServiceConfig(RepositoryPoc repositoryPoc) {
    return new ServiceConfig();
  }

  private ServiceConfig() {
    this.queryFacade = new PokerPlanningQueryFacadeImpl(repositoryPoc);
  }
}

