package org.example.newlibrarymanagementsystem.user.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "administrators")
public class Administrator extends User {
    private String adminLevel;
}
