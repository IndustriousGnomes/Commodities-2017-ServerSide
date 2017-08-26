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

    private String commodityId;
    private String contractSort;
    private String contractMonth;
    private Integer price;
    private Boolean inactive;

    private Commodity commodity;

    @ManyToOne
    @JoinColumn(name = "somename")
    public Commodity getCommodity() {
        return commodity;
    }
}
