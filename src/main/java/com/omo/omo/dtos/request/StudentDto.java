package com.omo.omo.dtos.request;

import com.omo.omo.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String studentCardNumber;
    List<Book> books= new ArrayList<>();

}
