package org.example.newlibrarymanagementsystem.loan.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.newlibrarymanagementsystem.book.domain.Book;
import org.example.newlibrarymanagementsystem.common.enums.LoanStatus;
import org.example.newlibrarymanagementsystem.user.domain.User;

@Entity
@Table(name = "loans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LoanStatus status;

    @Column(nullable = false)
    private String loanDate;

    @Column(nullable = false)
    private String dueDate;
}
