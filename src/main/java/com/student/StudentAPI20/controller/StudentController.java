package com.student.StudentAPI20.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.StudentAPI20.model.Student;
import com.student.StudentAPI20.model.StudentService;

@RestController
@RequestMapping("/example/v1/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("")
	public List<Student> students() {

		return studentService.getAllStudents();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentService.saveStudnet(student);
	}

}
