package com.Spring.SpringCore.services;

import com.Spring.SpringCore.model.Card;
import com.Spring.SpringCore.model.EnWord;
import com.Spring.SpringCore.repositories.CardRepository;
import com.Spring.SpringCore.repositories.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements  CardService{

    private final CardRepository cardRepository;


    @Override
    public Card getCard(Long id) {
        return cardRepository.getById(id);
    }
}
