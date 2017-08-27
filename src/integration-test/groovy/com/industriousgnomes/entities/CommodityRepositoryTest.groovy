package com.industriousgnomes.entities

import com.industriousgnomes.repository.CommodityRepository
import com.industriousgnomes.repository.ContractRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@SpringBootTest
@Transactional
class CommodityRepositoryTest extends Specification {

    @Autowired
    CommodityRepository commodityRepository

    @Autowired
    ContractRepository contractRepository

    Commodity commodity

    def setup() {
        commodity = Commodity.builder().id("BO").build()
    }

    def "Did repository get autowired"() {
        expect:
            commodityRepository != null
            contractRepository != null
    }

    def "Save something to the Commodity Repository"() {

        when:
            commodityRepository.save(commodity)

        then:
            commodityRepository.findAll().size() == 1
    }

    def "Save something to the Contract Repository"() {

        given:
            commodityRepository.save(commodity)
            def contract = Contract.builder().commodity(commodity).build()

        when:
            contractRepository.save(contract)

        then:
            contractRepository.findAll().size() == 1
    }

    def "Save something to both Repositories"() {

        given:
            def contract = Contract.builder().commodity(commodity).build()

        when:
            commodityRepository.save(commodity)
            contractRepository.save(contract)

        then:
            commodityRepository.findAll().size() == 1
            contractRepository.findAll().size() == 1
    }
}
