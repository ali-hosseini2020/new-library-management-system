package org.example.newlibrarymanagementsystem.user.service;
import org.example.newlibrarymanagementsystem.user.api.dto.UserCreateRequest;
import org.example.newlibrarymanagementsystem.user.api.dto.UserDTO;
import org.example.newlibrarymanagementsystem.user.api.dto.UserUpdateRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDTO createUser(UserCreateRequest request);

    UserDTO updateUser(Long id, UserUpdateRequest request);

    Optional<UserDTO> getUserById(Long id);

    List<UserDTO> getAllUsers();

    void deleteUser(Long id);
}





/*
public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO createUser(UserDTO userDTO);
    void deleteUser(Long id);

    UserDTO updateUser(Long id, UserDTO userDTO);
}

*/
