package com.eazybytes.Cards.dto;

import lombok.Data;

@Data
public class CardsDto {
    private Long card_Id;

    private String mobile_number;

    private String card_number;

    private String card_type;

    private int total_limit;

    private int amount_used;

    private int available_amount;
}
