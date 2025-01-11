package org.example.newlibrarymanagementsystem.user.repository;
import org.example.newlibrarymanagementsystem.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}





/*
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
*/
