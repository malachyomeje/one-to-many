package com.omo.omo.service;

import com.omo.omo.dtos.request.BookDto;
import com.omo.omo.dtos.request.StudentDto;
import com.omo.omo.dtos.response.StudentResponse;
import com.omo.omo.model.Book;

public interface StudentService {
    StudentResponse registerStudent(StudentDto studentDto);

//    StudentResponse addBook(Book book);

    //Student student = new Student();
    //    StudentDto studentDto =new StudentDto();
//    StudentResponse addBook (BookDto bookDto);
}
