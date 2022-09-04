package com.Spring.SpringCore.mappers;

import com.Spring.SpringCore.UserDTO.CardDTO;
import com.Spring.SpringCore.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardMapper {
    CardDTO toDTO(Card card);

    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);
}
