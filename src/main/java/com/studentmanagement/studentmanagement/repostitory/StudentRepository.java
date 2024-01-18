package com.studentmanagement.studentmanagement.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.studentmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
