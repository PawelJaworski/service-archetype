package pl.asc.edu.plannig

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import pl.asc.edu.plannig.app.note.AppNoteRepository
import pl.asc.edu.plannig.app.note.AppNote
import spock.lang.Specification

@SpringBootTest
class AppNoteIT extends Specification {

  @Autowired
  AppNoteRepository repository;

  def "it works"() {
    expect:
    long id = repository.save(new AppNote(null, "test note"))
            .id
    repository.findAll().forEach(System.out::println)
    repository.deleteById(id)
  }
}
