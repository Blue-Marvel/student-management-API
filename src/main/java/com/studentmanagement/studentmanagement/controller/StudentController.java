package com.studentmanagement.studentmanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.studentmanagement.model.Student;
import com.studentmanagement.studentmanagement.service.StudentService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/students")
public class StudentController {

  StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  // private ArrayList<Student> studentList = new ArrayList<Student>();

  @GetMapping
  public List<Student> getAllStudents(String param) {

    return studentService.getAllStudents();
  }

  @GetMapping("{id}")
  public Student getStudent(@PathVariable String id) {
    return studentService.getStudent(id);
  }

  @PostMapping
  public String postStudent(@RequestBody Student studentDetails) {
    studentService.createStudent(studentDetails);
    return "Successfully Posted";
  }

  @PutMapping("{id}")
  public String putStudetDetails(@PathVariable String id, @RequestBody Student studentDetails) {
    studentService.updateStudent(studentDetails, id);
    return "Successfully Updated";
  }

  @DeleteMapping("{id}")
  public String deleteStudentDetails(@PathVariable String id) {

    studentService.deleteStudent(id);
    return "Successfully Deleted";

  }

}
