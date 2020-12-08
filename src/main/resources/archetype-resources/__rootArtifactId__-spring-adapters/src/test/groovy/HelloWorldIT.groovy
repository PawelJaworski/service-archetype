package ${groupId}

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class HelloWorldIT extends Specification {

  def "it works"() {
    expect:
    true
  }
}
