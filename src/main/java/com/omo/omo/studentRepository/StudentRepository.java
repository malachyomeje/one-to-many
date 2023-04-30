package com.omo.omo.studentRepository;

import com.omo.omo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
   Optional<Student> findByEmail( String email);

}
