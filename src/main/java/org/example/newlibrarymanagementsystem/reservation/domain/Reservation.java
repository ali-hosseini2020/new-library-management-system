package org.example.newlibrarymanagementsystem.reservation.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.newlibrarymanagementsystem.book.domain.Book;
import org.example.newlibrarymanagementsystem.user.domain.User;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(nullable = false)
    private String reservationDate;
}
