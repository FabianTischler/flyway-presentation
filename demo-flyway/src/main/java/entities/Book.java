package entities;

import javax.persistence.*;

@Entity
@Table(name = "FW_BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FW_ID")
    private Long id;

    @Column(name = "FW_NAME")
    private String name;

    @Column(name = "FW_AUTHOR")
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
