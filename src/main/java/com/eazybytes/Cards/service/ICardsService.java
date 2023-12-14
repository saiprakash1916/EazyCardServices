package com.eazybytes.Cards.service;

import com.eazybytes.Cards.dto.CardsDto;

public interface ICardsService {
    void createCard(String mobileNumber);

    CardsDto fetchCard(String mobileNumber);
}
