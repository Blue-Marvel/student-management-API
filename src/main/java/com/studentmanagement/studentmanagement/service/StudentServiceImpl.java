package com.studentmanagement.studentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentmanagement.studentmanagement.model.Student;
import com.studentmanagement.studentmanagement.repostitory.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

  StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public String createStudent(Student student) {

    if (student == null) {
      return "Failed";
    }

    studentRepository.save(student);
    return "Student created successfully";
  }

  @Override
  public String updateStudent(Student student, String id) {
    if (student != null) {
      studentRepository.save(student);
    }

    return "Student updated successfully";
  }

  @Override
  public Student getStudent(String id) {

    if (id == null) {
      return null;
    }

    return studentRepository.findById(id).get();

  }

  @Override
  public List<Student> getAllStudents() {

    return studentRepository.findAll();
  }

  @Override
  public String deleteStudent(String id) {

    if (id == null) {
      return "Failed";
    }

    studentRepository.deleteById(id);

    return "Student deleted successfully";
  }

}
