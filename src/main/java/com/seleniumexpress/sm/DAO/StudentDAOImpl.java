package com.seleniumexpress.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.sm.api.Student;
import com.seleniumexpress.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO
{

	@Autowired
	private JdbcTemplate Jdbc;
	
	public List<Student> loadStudents()
	{
		List<Student> studentList;
		String query="SELECT * FROM seleniumexpress.students";
		studentList=Jdbc.query(query,new StudentRowMapper());
		
		return studentList;
	}

	public void saveStudent(Student student)
	{
		System.out.println(student.getId()+" from daoimpl");
		Object sqlparameter[]= {student.getName(),student.getMobile(),student.getCountry()};
		
		String sql="insert into students(name,mobile,country) values(?,?,?)";
		Jdbc.update(sql, sqlparameter);
		System.out.println("data inserter");
	}

	@Override
	public Student getStudent(int id)
	{
		String sql="select * from students where id=?";
		Student student=Jdbc.queryForObject(sql,new StudentRowMapper(),id);
		return student;
	}

	@Override
	public void updateStudent(Student student)
	{
		String sql ="Update students set name=?,mobile=?,country=? where id=?";
		Jdbc.update(sql,student.getName(),student.getMobile(),student.getCountry(),student.getId());
		
	}

	@Override
	public void deleteStudent(int id)
	{
		String sql="delete from students where id=?";
		Jdbc.update(sql,id);
	}

}
