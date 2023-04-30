package com.omo.omo.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="studentIdCard")
//@ToString
public class StudentIdCard {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

    private String studentCardNumber;


    @OneToOne(
//            cascade = CascadeType.ALL
//            ,fetch = FetchType.EAGER
    )
    @JoinColumn(name = "studentId",
            referencedColumnName = "id")
   private Student student;

}
