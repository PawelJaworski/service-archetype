package pl.asc.edu.plannig.adapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.asc.edu.plannig.PokerPlanningQueryFacade;
import pl.asc.edu.plannig.adapter.ServiceConfig;

@Configuration
public class ServiceSpringConfig {
  private final ServiceConfig serviceConfig;

  public ServiceSpringConfig() {
    this.serviceConfig = ServiceConfig
      .builder()
      .build();
  }

  @Bean
  ${classPrefix}QueryFacade pokerPlanningQueryFacade() {
    return serviceConfig.queryFacade;
  }
}
