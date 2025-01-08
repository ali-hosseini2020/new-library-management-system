package org.example.newlibrarymanagementsystem.user.api.mapper;

import org.example.newlibrarymanagementsystem.user.api.dto.UserDTO;
import org.example.newlibrarymanagementsystem.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}

