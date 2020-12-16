package pl.asc.edu.plannig.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.asc.edu.plannig.PokerPlanningQueryFacade;
import pl.asc.edu.plannig.application.ResponsePoc;

@RestController
@RequiredArgsConstructor
class ${classPrefix}RestAdapter {
  private final PokerPlanningQueryFacade queryFacade;


  @GetMapping("/responsePoc")
  ResponseEntity<ResponsePoc> getResponsePoc() {
    return ResponseEntity.ok(queryFacade.getSingleResponsePoc());
  }
}
