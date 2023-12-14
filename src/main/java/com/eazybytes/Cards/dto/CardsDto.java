package com.eazybytes.Cards.dto;

import lombok.Data;

@Data
public class CardsDto {
    private Long card_Id;

    private String mobileNumber;

    private String cardNumber;

    private String cardType;

    private int totalLimit;

    private int amountUsed;

    private int availableAmount;
}
