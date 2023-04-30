package com.omo.omo.studentRepository;

import com.omo.omo.model.StudentIdCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentIdCardRepository extends JpaRepository<StudentIdCard, Long> {
Optional<StudentIdCard>findByStudentCardNumber(String studentCardNumber);

}
