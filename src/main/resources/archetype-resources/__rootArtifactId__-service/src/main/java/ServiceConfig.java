package ${groupId};

public final class ServiceConfig {
  public final ${classPrefix}QueryFacade queryFacade;

  public ServiceConfig() {
    this.queryFacade = new ${classPrefix}QueryFacadeImpl();
  }
}
