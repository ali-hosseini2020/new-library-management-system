package org.example.newlibrarymanagementsystem.user.domain;
import jakarta.persistence.*;
import lombok.*;
import java.awt.print.Book;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "librarians")
public class Librarian extends User {

    @Column(nullable = false)
    private String libraryBranch;

    @OneToMany(mappedBy = "librarian", cascade = CascadeType.ALL)
    private List<Book> managedBooks;
}


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
