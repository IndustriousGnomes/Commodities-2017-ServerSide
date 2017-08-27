package com.industriousgnomes.entities;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Commodity {

    @Id
    private String  id;
    private String  exchange;
    private String  name;
    private String  unitType;
    private Integer unitSize;
    private String  unitPrice;
    private Double  tickSize;
    private Double  ticketPrice;
    private Integer tickDailyLimit;
    private Integer contractStandardPrice;
    private Integer displayDecimals;
    private String  openOutcrySymbol;
    private String  acmSymbol;
    private Integer tradeMonthMask;
    private Integer lastTradeDay;
    private String  databaseSymbol;
    private Boolean inactive = false;

    @OneToMany(mappedBy = "commodity", cascade = CascadeType.ALL)
    private Set<Contract> contracts;

}

