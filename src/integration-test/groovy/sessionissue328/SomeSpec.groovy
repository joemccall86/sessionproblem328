package sessionissue328


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class SomeSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        setup:
        new Person(name: "John Doe").save(failOnError: true, flush: true)

        when:
        def retrievedPerson
        Person.withNewSession {
            retrievedPerson = Person.findByName("John Doe")
        }

        then:
        retrievedPerson
    }
}
