package org.example.newlibrarymanagementsystem.user.event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.time.LocalDateTime;

/**
 * Represents a domain event triggered when a new user is created.
 */
@Getter
@AllArgsConstructor
@ToString
public class UserCreatedEvent {

    private final Long userId;           // Unique ID of the created user
    private final String username;       // Username of the created user
    private final String email;          // Email of the created user
    private final LocalDateTime createdAt; // Timestamp of the event

    // Additional fields like roles or metadata can also be included
}



/*
@Getter
@AllArgsConstructor
public class UserCreatedEvent {
    private Long userId;
    private String username;
    private String email;
}*/
