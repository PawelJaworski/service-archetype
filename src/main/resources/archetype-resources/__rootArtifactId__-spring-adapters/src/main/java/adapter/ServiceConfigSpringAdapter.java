package ${groupId}.adapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ${groupId}.application.query.${classPrefix}QueryFacade;
import ${groupId}.adapter.jpa.RepositoryExampleJpaAdapter;
import ${groupId}.application.command.${classPrefix}CommandFacade;

@Configuration
public class ServiceConfigSpringAdapter {
  private final ServiceConfig serviceConfig;

  public ServiceConfigSpringAdapter(RepositoryExampleJpaAdapter RepositoryExampleJpaAdapter) {
    this.serviceConfig = ServiceConfig
      .builder()
            .RepositoryExample(RepositoryExampleJpaAdapter)
      .build();
  }

  @Bean
  ${classPrefix}QueryFacade queryFacade() {
    return serviceConfig.queryFacade;
  }

  @Bean
  ${classPrefix}CommandFacade commandFacade() {
    return serviceConfig.commandFacade;
  }
}
