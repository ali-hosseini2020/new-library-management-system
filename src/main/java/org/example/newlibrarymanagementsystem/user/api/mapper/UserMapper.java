package org.example.newlibrarymanagementsystem.user.api.mapper;
import org.example.newlibrarymanagementsystem.user.api.dto.UserCreateRequest;
import org.example.newlibrarymanagementsystem.user.api.dto.UserDTO;
import org.example.newlibrarymanagementsystem.user.api.dto.UserUpdateRequest;
import org.example.newlibrarymanagementsystem.user.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // Map User entity to UserDTO
    @Mapping(source = "role", target = "role", expression = "java(user.getRole().toString())")
    UserDTO toDTO(User user);

    // Map UserCreateRequest to User entity
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "role", target = "role", expression = "java(com.library.common.enums.UserRole.valueOf(request.getRole()))")
    User toEntity(UserCreateRequest request);

    // Update User entity with UserUpdateRequest
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "role", target = "role", expression = "java(com.library.common.enums.UserRole.valueOf(request.getRole()))")
    void updateEntity(@MappingTarget User user, UserUpdateRequest request);
}













/*
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}

*/
