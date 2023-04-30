package com.omo.omo.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity( name ="Student")
@Table(name="student")
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    @OneToOne(mappedBy = "student",
            orphanRemoval = true
    )
    private StudentIdCard studentIdCard;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "student",
          orphanRemoval = true
    )
    private List<Book>books;


}
