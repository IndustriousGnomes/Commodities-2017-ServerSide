package com.industriousgnomes.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Contract {

    @Id
    @GeneratedValue
    private long id;

    private String contractSort;
    private String contractMonth;
    private Integer price;
    private Boolean inactive;

    @ManyToOne
    @JoinColumn(name = "commodity_id")
    private Commodity commodity;
}
