package ${groupId}.adapter.rest;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import ${groupId}.application.query.${classPrefix}QueryFacade;
import ${groupId}.application.command.${classPrefix}CommandFacade;


@Controller("/example")
public class ExampleController {

    private final ${classPrefix}QueryFacade queryFacade;
    private final ${classPrefix}CommandFacade commandFacade;

    public ExampleController(${classPrefix}QueryFacade queryFacade, ${classPrefix}CommandFacade commandFacade) {
        this.queryFacade = queryFacade;
        this.commandFacade = commandFacade;
    }

    @Get
    HttpResponse getExample() {
        return HttpResponse.ok(queryFacade.getSingleResponseExample());
    }
}
