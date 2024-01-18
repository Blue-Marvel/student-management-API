package com.studentmanagement.studentmanagement.service;

import java.util.List;

import com.studentmanagement.studentmanagement.model.Student;

public interface StudentService {

  public String createStudent(Student student);

  public String updateStudent(Student student, String id);

  public Student getStudent(String id);

  public List<Student> getAllStudents();

  public String deleteStudent(String id);
}