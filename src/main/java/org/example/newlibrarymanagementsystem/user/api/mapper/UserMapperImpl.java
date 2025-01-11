package org.example.newlibrarymanagementsystem.user.api.mapper;
import org.example.newlibrarymanagementsystem.common.enums.UserRole;
import org.example.newlibrarymanagementsystem.user.api.dto.UserCreateRequest;
import org.example.newlibrarymanagementsystem.user.api.dto.UserDTO;
import org.example.newlibrarymanagementsystem.user.api.dto.UserUpdateRequest;
import org.example.newlibrarymanagementsystem.user.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }

        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .role(user.getRole() != null ? user.getRole().name() : null) // Enum to String
                .build();
    }

    @Override
    public User toEntity(UserCreateRequest request) {
        if (request == null) {
            return null;
        }

        return User.builder()
                .username(request.getUsername())
                .password(request.getPassword()) // Ensure password is encrypted before saving
                .email(request.getEmail())
                .role(request.getRole() != null ? UserRole.valueOf(request.getRole()) : null) // String to Enum
                .build();
    }

    @Override
    public void updateEntity(User user, UserUpdateRequest request) {
        if (user == null || request == null) {
            return;
        }

        if (request.getUsername() != null) {
            user.setUsername(request.getUsername());
        }
        if (request.getEmail() != null) {
            user.setEmail(request.getEmail());
        }
        if (request.getRole() != null) {
            user.setRole(UserRole.valueOf(request.getRole())); // Update role if provided
        }
    }
}
