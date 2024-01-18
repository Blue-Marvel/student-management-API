package com.studentmanagement.studentmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {

  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String matNumber;

  public Student() {
  }

  public Student(String firstName, String lastName, String matNumber, String id) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.matNumber = matNumber;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMatNumber() {
    return matNumber;
  }

  public void setMatNumber(String matNumber) {
    this.matNumber = matNumber;
  }

}
