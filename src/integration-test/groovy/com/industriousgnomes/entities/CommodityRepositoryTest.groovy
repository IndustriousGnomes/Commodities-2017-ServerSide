package com.industriousgnomes.entities

import com.industriousgnomes.repository.CommodityRepository
import com.industriousgnomes.repository.ContractRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class CommodityRepositoryTest extends Specification {

    @Autowired
    CommodityRepository commodityRepository

    @Autowired
    ContractRepository contractRepository

    def "Did repository get autowired"() {
        expect:
            commodityRepository != null

    }

    def "Save something to the Commodity Repository"() {

        given:
            def commodity = Commodity.builder().id("BO").build()

        when:
            commodityRepository.save(commodity)

        then:
            commodityRepository.findAll().size() == 1
    }

    def "Save something to the Contract Repository"() {

        given:
            def contract = Contract.builder().commodityId("BO").build()

        when:
            contractRepository.save(contract)

        then:
            contractRepository.findAll().size() == 1
    }

    def "Save something to the both Repository"() {

        given:
            def commodity = Commodity.builder().id("BO").build()
            def contract = Contract.builder().commodityId("BO").build()

        when:
            commodityRepository.save(commodity)
            contractRepository.save(contract)

        then:
            commodityRepository.findAll().size() == 1
            contractRepository.findAll().size() == 1
    }
}
