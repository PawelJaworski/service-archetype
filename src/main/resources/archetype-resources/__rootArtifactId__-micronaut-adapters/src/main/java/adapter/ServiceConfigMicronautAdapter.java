package ${groupId}.adapter;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import ${groupId}.${classPrefix}QueryFacade;
import ${groupId}.application.${classPrefix}CommandFacade;

import javax.inject.Singleton;

@Factory
public class ServiceConfigMicronautAdapter {
  private final ServiceConfig serviceConfig;

  public ServiceConfigMicronautAdapter() {
    this.serviceConfig = ServiceConfig
      .builder()
      .build();
  }

  @Singleton
  ${classPrefix}QueryFacade queryFacade() {
    return serviceConfig.queryFacade;
  }

  @Singleton
  ${classPrefix}CommandFacade commandFacade() {
    return serviceConfig.commandFacade;
  }
}
