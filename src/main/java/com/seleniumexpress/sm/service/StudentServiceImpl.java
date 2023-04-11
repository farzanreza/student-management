package com.seleniumexpress.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;

	public List<Student> loadStudents()
	{
		List<Student>studentlist=studentDAO.loadStudents();
		return studentlist;
	}

	@Override
	public void saveStudent(Student student)
	{
	   studentDAO.saveStudent(student);	
	}

	@Override
	public Student getStudent(int id)
	{
	    Student student=studentDAO.getStudent(id);
		return  student; 
	}

	@Override
	public void update(Student student)
	{
		studentDAO.updateStudent(student);
		
	}

	@Override
	public void deleteStudent(int id)
	{
	   studentDAO.deleteStudent(id);
	}

}
