package com.student.StudentAPI20.repo;

import org.springframework.data.repository.CrudRepository;

import com.student.StudentAPI20.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
