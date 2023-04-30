package com.omo.omo.controller;

import com.omo.omo.dtos.request.BookDto;
import com.omo.omo.dtos.response.StudentResponse;
import com.omo.omo.model.Book;
import com.omo.omo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/registerBook")
public class BookController {
    private final BookService bookService;

    @PostMapping("/addBook")
    public StudentResponse register( @RequestBody BookDto bookDto){
        return bookService.addBook(bookDto);
    }

    @GetMapping("/getBooks")
    public List<Book> getBook(@RequestParam Long id){
        return bookService.getStudentsBooks(id);
    }

}
