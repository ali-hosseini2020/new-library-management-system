package org.example.newlibrarymanagementsystem.user.service;
import org.example.newlibrarymanagementsystem.user.api.dto.UserDTO;
import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO createUser(UserDTO userDTO);
    void deleteUser(Long id);

    UserDTO updateUser(Long id, UserDTO userDTO);
}

