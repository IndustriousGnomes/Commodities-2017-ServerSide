package com.industriousgnomes

import com.industriousgnomes.spike.InjectMe
import com.industriousgnomes.spike.Spike
import spock.lang.Specification
import spock.lang.Subject

/**
 * Created by jrtitko1 on 8/6/17.
 */
class SpikeTest extends Specification {

    @Subject
    Spike spike

    InjectMe injectMe = Mock()

    def "Spike test to make sure spock works"() {
        given:
            spike = new Spike(
                    injectMe: injectMe
            )
            injectMe.execute() >> true

        when:
            def result = spike.testMe()

        then:
            result
    }
}
