package ${groupId}.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ${groupId}.${classPrefix}QueryFacade;
import ${groupId}.application.${classPrefix}CommandFacade;
import ${groupId}.application.ResponsePoc;

@RestController
@RequiredArgsConstructor
class ${classPrefix}RestAdapter {
  private final ${classPrefix}QueryFacade queryFacade;
  private final ${classPrefix}CommandFacade commandFacade;

  @GetMapping("/poc/{value}")
  void postPoc(@PathVariable String value) {
    commandFacade.savePoc(value);
  }

  @GetMapping("/poc")
  ResponseEntity<ResponsePoc> getResponsePoc() {
    return ResponseEntity.ok(queryFacade.getSingleResponsePoc());
  }
}
