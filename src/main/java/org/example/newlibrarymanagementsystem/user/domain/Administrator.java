package org.example.newlibrarymanagementsystem.user.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "administrators")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String employeeId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}

/*
public class Administrator extends User {
    private String adminLevel;
}
*/
