package com.Spring.SpringCore.mappers;

import com.Spring.SpringCore.UserDTO.UserDTO;
import com.Spring.SpringCore.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO toDTO(User user);
}
