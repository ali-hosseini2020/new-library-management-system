package org.example.newlibrarymanagementsystem.user.api.dto;
import lombok.Data;
import org.example.newlibrarymanagementsystem.common.enums.UserRole;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String fullName;
    private UserRole role;
    private boolean active;
}

