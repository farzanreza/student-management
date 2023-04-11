package com.seleniumexpress.sm.service;

import java.util.List;

import com.seleniumexpress.sm.api.Student;

public interface StudentService {
	
	public List<Student> loadStudents();

	public void saveStudent(Student student);
	
	public Student getStudent(int id);
	
	public void update(Student student);

	public void deleteStudent(int id);
	
}
