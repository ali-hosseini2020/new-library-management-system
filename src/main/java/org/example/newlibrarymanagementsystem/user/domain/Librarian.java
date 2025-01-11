package org.example.newlibrarymanagementsystem.user.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "librarians")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

public class Librarian {

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
public class Librarian extends User {
    @Column(nullable = false)
    private String libraryBranch;

    @OneToMany(mappedBy = "librarian", cascade = CascadeType.ALL)
    private List<Book> managedBooks;
}
*/

/*
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Librarian extends User {

    @Column(nullable = false)
    private String libraryBranch;

    @OneToMany(mappedBy = "librarian", cascade = CascadeType.ALL)
    private List<Book> managedBooks;
}*/
