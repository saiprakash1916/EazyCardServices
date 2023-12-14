package com.eazybytes.Cards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Cards extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long card_Id;

    private String mobileNumber;

    private String cardNumber;

    private String cardType;

    private int totalLimit;

    private int amountUsed;

    private int availableAmount;
}
