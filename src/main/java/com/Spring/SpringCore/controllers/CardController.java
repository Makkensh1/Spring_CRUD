package com.Spring.SpringCore.controllers;

import com.Spring.SpringCore.UserDTO.CardDTO;
import com.Spring.SpringCore.mappers.CardMapper;
import com.Spring.SpringCore.model.Card;
import com.Spring.SpringCore.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;


    @GetMapping("cards/{id}")
    public CardDTO sayHello(@PathVariable String id) {
        Card card = cardService.getCard(Long.valueOf(id));
        return CardMapper.INSTANCE.toDTO(card);
    }


}
