package com.omo.omo.service;

import com.omo.omo.dtos.request.StudentDto;
import com.omo.omo.dtos.response.StudentResponse;
import com.omo.omo.model.Student;
import com.omo.omo.model.StudentIdCard;
import com.omo.omo.studentRepository.StudentIdCardRepository;
import com.omo.omo.studentRepository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentIdCardRepository studentIdCardRepository;


    @Override
    public StudentResponse registerStudent(StudentDto studentDto) {
        Optional<Student> student = studentRepository.findByEmail(studentDto.getEmail());
        Optional<StudentIdCard> studentIdCard = studentIdCardRepository.
                findByStudentCardNumber(studentDto.getStudentCardNumber());


        if (student.isPresent()) {
            return new StudentResponse("student all ready exist ");
        }
        if (!studentDto.getEmail().contains("@")) {

            return new StudentResponse("student email not coreect");
        }

        Student student1 = new Student();
        student1.setFirstName(studentDto.getFirstName());
        student1.setLastName(studentDto.getLastName());
        student1.setEmail(studentDto.getEmail());
        student1.setAge(studentDto.getAge());

        studentRepository.save(student1);
        if (studentIdCard.isPresent()) {
            return new StudentResponse("CARD ALREADY EXIST");
        }
        if (!studentDto.getStudentCardNumber().startsWith("2014234")
                && (studentDto.getStudentCardNumber().length() <= 10)) {
            return new StudentResponse("INCORRECT CARD NUMBER");
        }
        StudentIdCard studentno = new StudentIdCard();
        studentno.setStudentCardNumber(studentDto.getStudentCardNumber());
        studentno.setStudent(student1);

        studentIdCardRepository.save(studentno);

        return new StudentResponse("REGISTRATION COMPLETE.");


    }

}


