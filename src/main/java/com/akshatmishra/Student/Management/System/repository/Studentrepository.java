package com.akshatmishra.Student.Management.System.repository;

import com.akshatmishra.Student.Management.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {
}
