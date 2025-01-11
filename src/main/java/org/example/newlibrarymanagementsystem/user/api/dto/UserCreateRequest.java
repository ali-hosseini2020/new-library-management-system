package org.example.newlibrarymanagementsystem.user.api.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

public class UserCreateRequest {
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @Email(message = "Email must be valid")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Role is required")
    private String role; // Should be validated against a whitelist in a custom validator
}

/*
public class UserCreateRequest {
    private String username;
    private String password;
    private String email;
    private String role; // Enum as a string (e.g., "ADMINISTRATOR", "LIBRARIAN", "MEMBER")
}
*/
