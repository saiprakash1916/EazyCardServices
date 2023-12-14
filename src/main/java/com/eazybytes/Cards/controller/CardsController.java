package com.eazybytes.Cards.controller;

import com.eazybytes.Cards.constants.CardsConstants;
import com.eazybytes.Cards.dto.CardsDto;
import com.eazybytes.Cards.dto.ResponseDto;
import com.eazybytes.Cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class CardsController {

    private ICardsService iCardsService;
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createCard(String mobileNumber){
        iCardsService.createCard(mobileNumber);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(CardsConstants.STATUS_201, CardsConstants.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestParam String mobileNumber){
        CardsDto cardsDto = iCardsService.fetchCard(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(cardsDto);
    }
}
