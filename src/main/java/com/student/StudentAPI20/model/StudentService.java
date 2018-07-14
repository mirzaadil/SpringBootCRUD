package com.student.StudentAPI20.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.StudentAPI20.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	// Get all Student information
	public List<Student> getAllStudents() {
		List<Student> liststudent = new ArrayList<>();
		studentRepo.findAll().forEach(s -> liststudent.add(s));
		return liststudent;
	}

	// save single student information
	public void saveStudnet(Student student) {
		studentRepo.save(student);
	}

}
