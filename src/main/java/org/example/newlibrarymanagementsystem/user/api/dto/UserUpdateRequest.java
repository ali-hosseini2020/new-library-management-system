package org.example.newlibrarymanagementsystem.user.api.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

public class UserUpdateRequest {
    private String username;
    private String email;
    private String role; // Enum as a string
}
