package com.Spring.SpringCore.mappers;

import com.Spring.SpringCore.UserDTO.EnWordDTO;
import com.Spring.SpringCore.model.EnWord;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnWOrdMapper {
    EnWordDTO toDTO(EnWord enWord);

    EnWOrdMapper INSTANCE = Mappers.getMapper(EnWOrdMapper.class);
}
