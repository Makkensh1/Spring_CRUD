package com.Spring.SpringCore.mappers;

import com.Spring.SpringCore.UserDTO.CardDTO;
import com.Spring.SpringCore.UserDTO.EnWordDTO;
import com.Spring.SpringCore.model.Card;
import com.Spring.SpringCore.model.EnWord;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardMapper {
    CardDTO toDTO(Card card);
    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);
}
