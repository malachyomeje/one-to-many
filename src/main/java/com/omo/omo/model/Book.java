package com.omo.omo.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity( name ="Book")
//@Table(name="book")

@ToString
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

    private String bookName;
    private String authorName;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "books",
          referencedColumnName = "id",
           foreignKey = @ForeignKey( name="student_book_id")
    )
    private Student student;

}
