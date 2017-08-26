package com.industriousgnomes

import com.industriousgnomes.spike.InjectMe
import com.industriousgnomes.spike.Spike
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

/**
 * Created by jrtitko1 on 8/6/17.
 */
class SpikeTest extends Specification {

    @Subject
    Spike spike

    InjectMe injectMe = Mock()

    def setup() {
        spike = new Spike(
                injectMe: injectMe
        )
    }

    def "Spike test to make sure spock works"() {
        given:
            injectMe.execute() >> true

        when:
            def result = spike.testMe()

        then:
            result
    }

    @Unroll
    def "Sum numbers from 1 to #max"() {
        when:
            def sum = spike.sumNumbers(max);

        then:
            sum == solution


        where:
            max | solution
            10  | 55
            20  | 210
    }
}
