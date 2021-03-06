package ${groupId}.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ${groupId}.application.query.${classPrefix}QueryFacade;
import ${groupId}.application.command.${classPrefix}CommandFacade;
import ${groupId}.application.query.Result;

@RestController
@RequiredArgsConstructor
class ${classPrefix}RestAdapter {
  private final ${classPrefix}QueryFacade queryFacade;
  private final ${classPrefix}CommandFacade commandFacade;

  @GetMapping("/example/{value}")
  void postPoc(@PathVariable String value) {
    commandFacade.savePoc(value);
  }

  @GetMapping("/example")
  ResponseEntity<Result> getResponsePoc() {
    return ResponseEntity.ok(queryFacade.getSingleResponseExample());
  }
}
