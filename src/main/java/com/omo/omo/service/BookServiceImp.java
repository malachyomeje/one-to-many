package com.omo.omo.service;

import com.omo.omo.dtos.request.BookDto;
import com.omo.omo.dtos.response.StudentResponse;
import com.omo.omo.model.Book;
import com.omo.omo.model.Student;
import com.omo.omo.studentRepository.BookRepository;
import com.omo.omo.studentRepository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;
    private final StudentRepository studentRepository;


    @Override
    public StudentResponse addBook (BookDto bookDto){
        Student student1 = new Student();
        Optional<Student> student = studentRepository.findById(bookDto.getStudentId());
        if(student.isEmpty()){
            return new StudentResponse("No student with the specified Id");
        }
        student1 = student.get();
        Book book = new Book();
        book.setBookName(bookDto.getBookName());
        book.setAuthorName(bookDto.getAuthorName());
        book.setStudent(student1);
        bookRepository.save(book);
        return new StudentResponse("book save succesfully");
    }




    @Override
    public List<Book> getStudentsBooks(Long id){
return bookRepository.findAllByStudent(id);

    }

}




