package ${groupId}.adapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ${groupId}.${classPrefix}QueryFacade;
import ${groupId}.adapter.jpa.PocRepositoryJpaAdapter;
import ${groupId}.application.${classPrefix}CommandFacade;

@Configuration
public class ServiceConfigSpringAdapter {
  private final ServiceConfig serviceConfig;

  public ServiceConfigSpringAdapter(PocRepositoryJpaAdapter pocRepositoryJpaAdapter) {
    this.serviceConfig = ServiceConfig
      .builder()
            .repositoryPoc(pocRepositoryJpaAdapter)
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
