package com.industriousgnomes.entities

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class AccountTest extends Specification {

    @Subject
    Account account = new Account()

    @Unroll("For #cents should equal #dollars")
    def "GetCapital"() {
        given:
            account.setCapital(cents)

        when:
            def capital = account.getCapitalAsDollars();

        then:
            capital == dollars

        where:
            cents       | dollars
            10000       | 100.00
            0           | 0.00
            1           | 0.01
            100000000000| 1000000000.00
    }
}
