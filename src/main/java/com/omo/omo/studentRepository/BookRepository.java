package com.omo.omo.studentRepository;

import com.omo.omo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {
    Optional<Book>findByBookName(String bookName);
    List<Book> findAllByStudent(Long id);
}
