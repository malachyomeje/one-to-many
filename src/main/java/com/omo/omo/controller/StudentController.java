package com.omo.omo.controller;

import com.omo.omo.dtos.request.StudentDto;
import com.omo.omo.dtos.response.StudentResponse;
import com.omo.omo.model.Book;
import com.omo.omo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/library")

public class StudentController {
    private final StudentService studentService;

    @PostMapping("/register")
    public StudentResponse registerStudent(@RequestBody StudentDto studentDto) {
        return studentService.registerStudent(studentDto);
    }
//    @PostMapping("/obi")
//public StudentResponse addBook(Book book){
//        return studentService.addBook(book);
//
//}

    }
