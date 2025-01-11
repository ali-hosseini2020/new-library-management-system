package org.example.newlibrarymanagementsystem.book.domain;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "authors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Book> books;
}
