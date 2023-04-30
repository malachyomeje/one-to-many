package com.omo.omo.service;

import com.omo.omo.dtos.request.BookDto;
import com.omo.omo.dtos.response.StudentResponse;
import com.omo.omo.model.Book;

import java.util.List;

public interface BookService {
    StudentResponse addBook(BookDto bookDto);


    List<Book> getStudentsBooks(Long id);
}
