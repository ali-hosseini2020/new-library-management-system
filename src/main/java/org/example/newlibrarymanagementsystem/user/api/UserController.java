package org.example.newlibrarymanagementsystem.user.api;
import org.example.newlibrarymanagementsystem.user.api.dto.UserCreateRequest;
import org.example.newlibrarymanagementsystem.user.api.dto.UserDTO;
import org.example.newlibrarymanagementsystem.user.api.dto.UserUpdateRequest;
import org.example.newlibrarymanagementsystem.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.HttpStatus;
import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    /**
     * Create a new user.
     */
    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserCreateRequest request) {
        UserDTO user = userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    /**
     * Update an existing user by ID.
     */
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(
            @PathVariable Long id,
            @RequestBody UserUpdateRequest request) {
        UserDTO updatedUser = userService.updateUser(id, request);
        return ResponseEntity.ok(updatedUser);
    }

    /**
     * Get a user by ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        UserDTO user = userService.getUserById(id)
                .orElseThrow(() -> new RuntimeException("Unexpected error"));
        return ResponseEntity.ok(user);
    }

    /**
     * Get all users.
     */
    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    /**
     * Delete a user by ID.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}







/*
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    */
/**
     * Create a new user.
     * @param userRequest User creation details.
     * @return Created UserDTO.
     *//*

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userRequest) {
        if (userRequest.getUsername() == null || userRequest.getEmail() == null) {
            throw new BusinessException("Name and Email are mandatory fields.");
        }
        UserDTO createdUser = userService.createUser(userRequest);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    */
/**
     * Get user by ID.
     * @param id User ID.
     * @return UserDTO for the requested user.
     *//*

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserDTO>> getUserById(@PathVariable Long id) {
        Optional<UserDTO> user = userService.getUserById(id);
        if (user.isEmpty()) {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
        return ResponseEntity.ok(user);
    }

    */
/**
     * Update an existing user.
     * @param id User ID.
     * @param userRequest User update details.
     * @return Updated UserDTO.
     *//*

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userRequest) {
        if (userRequest.getUsername() == null || userRequest.getEmail() == null) {
            throw new BusinessException("Name and Email are mandatory fields.");
        }
        UserDTO updatedUser = userService.updateUser(id, userRequest);
        if (updatedUser == null) {
            throw new ResourceNotFoundException("User with ID " + id + " not found.");
        }
        return ResponseEntity.ok(updatedUser);
    }

    */
/**
     * Delete a user by ID.
     * @param id User ID.
     * @return No content response if deleted successfully.
     *//*

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    */
/**
     * List all users.
     * @return List of all UserDTOs.
     *//*

    @GetMapping
    public ResponseEntity<List<UserDTO>> listAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
*/
